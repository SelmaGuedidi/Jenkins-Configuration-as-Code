import com.michelin.ci.jenkins.plugins.authmatrix.*
import com.cloudbees.hudson.plugins.folder.properties.AuthorizationMatrixProperty
def setPermissions(folderName, permissionsMap) {
    def folder = Jenkins.instance.getItemByFullName(folderName)
    if (folder) {
        def authorizationMatrix = folder.getProperties().find { it instanceof AuthorizationMatrixProperty }
        if (!authorizationMatrix) {
            authorizationMatrix = new AuthorizationMatrixProperty()
            folder.addProperty(authorizationMatrix)
        }
        
        permissionsMap.each { permission, users ->
            users.each { user ->
                authorizationMatrix.add(permission, user)
            }
        }
        folder.save()
    } else {
        println "Folder ${folderName} not found!"
    }
}

// Define permissions for folder1
def permissionsFolder1 = [
    'hudson.model.Item.READ': ['user1', 'user2'],
    'hudson.model.Item.BUILD': ['user1'],
    'hudson.model.Item.DELETE': ['admin'],
    'hudson.model.Item.CREATE': ['admin']
]

setPermissions('folder1', permissionsFolder1)