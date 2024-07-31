import com.michelin.ci.jenkins.plugins.authmatrix.*
import com.cloudbees.hudson.plugins.folder.properties.AuthorizationProperty
def setPermissions(folderName, permissionsMap) {
    def folder = Jenkins.instance.getItemByFullName(folderName)
    if (folder) {
        def authorizationMatrix = folder.getProperties().find { it instanceof AuthorizationProperty }
        if (!authorizationMatrix) {
            authorizationMatrix = new AuthorizationProperty()
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

// Define permissions for folder2
def permissionsFolder2 = [
    'hudson.model.Item.READ': ['user1', 'user2'],
    'hudson.model.Item.BUILD': ['user1'],
    'hudson.model.Item.DELETE': ['admin'],
    'hudson.model.Item.CREATE': ['admin']
]

setPermissions('folder2', permissionsFolder2)
