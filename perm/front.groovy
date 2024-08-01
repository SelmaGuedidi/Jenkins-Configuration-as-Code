import hudson.security.GlobalMatrixAuthorizationStrategy
import hudson.security.Permission
import hudson.security.ProjectMatrixAuthorizationStrategy
import jenkins.model.Jenkins
import org.jenkinsci.plugins.matrixauth.PermissionEntry
import org.jenkinsci.plugins.matrixauth.AuthorizationProperty

def jobName = 'folder1/front'

def jenkinsInstance = Jenkins.getInstance()
def job = jenkinsInstance.getItemByFullName(jobName)

if (job) {
    def strategy = new ProjectMatrixAuthorizationStrategy()
    
    // Permissions for admin
    strategy.add(Item.READ, 'admin')
    strategy.add(Item.BUILD, 'admin')
    strategy.add(Item.CONFIGURE, 'admin')
    strategy.add(Item.DELETE, 'admin')

    // Permissions for user1
    strategy.add(Item.READ, 'user1')
    strategy.add(Item.BUILD, 'user1')
    strategy.add(Item.CONFIGURE, 'user1')

    // Permissions for user2
    strategy.add(Item.READ, 'user2')
    strategy.add(Item.BUILD, 'user2')

    job.addProperty(strategy)
    job.save()
} else {
    println("Job '${jobName}' not found!")
}
