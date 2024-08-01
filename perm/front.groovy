import jenkins.model.Jenkins
import hudson.security.*

def jobName = 'folder1/front'

def jenkinsInstance = Jenkins.getInstance()
def job = jenkinsInstance.getItemByFullName(jobName)

if (job) {
    def strategy = new AuthorizationMatrixProperty()
    
    // Permissions for admin
    strategy.add(Item.READ, 'admin')
    strategy.add(Item.BUILD, 'admin')
    strategy.add(Item.DELETE, 'admin')

    // Permissions for user1
    strategy.add(Item.READ, 'user1')
    strategy.add(Item.BUILD, 'user1')

    // Permissions for user2
    strategy.add(Item.READ, 'user2')
    strategy.add(Item.BUILD, 'user2')

    job.addProperty(strategy)
    job.save()
} else {
    println("Job '${jobName}' not found!")
}
