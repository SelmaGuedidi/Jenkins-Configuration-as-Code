import jenkins.model.Jenkins
import hudson.security.*

def jobName = 'folder1/front'


def jenkinsInstance = Jenkins.getInstance()
def job = jenkinsInstance.getItemByFullName(jobName)

if (job) {
    def strategy = new AuthorizationMatrixProperty()
    
    // Permissions for admin
    strategy.add(hudson.model.Item.READ, 'admin')
    strategy.add(hudson.model.Item.BUILD, 'admin')
    strategy.add(hudson.model.Item.DELETE, 'admin')

    // Permissions for user1
    strategy.add(hudson.model.Item.READ, 'user1')
    strategy.add(hudson.model.Item.BUILD, 'user1')

    // Permissions for user2
    strategy.add(hudson.model.Item.READ, 'user2')
    strategy.add(hudson.model.Item.BUILD, 'user2')

    job.addProperty(strategy)
    job.save()
} else {
    println("Job '${jobName}' not found!")
}
