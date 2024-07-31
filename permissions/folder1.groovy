import jenkins.model.Jenkins
import com.cloudbees.hudson.plugins.folder.properties.AuthorizationMatrixProperty
import hudson.security.Permission

def folder = Jenkins.instance.getItem('folder1')

def property = new AuthorizationMatrixProperty([
    // Admin has full permissions
    Permission.fromId('hudson.model.Item.Read'): ['admin'],
    Permission.fromId('hudson.model.Item.Configure'): ['admin'],
    Permission.fromId('hudson.model.Item.Create'): ['admin'],
    Permission.fromId('hudson.model.Item.Delete'): ['admin'],

    // User1 has read and build permissions
    Permission.fromId('hudson.model.Item.Read'): ['user1'],
    Permission.fromId('hudson.model.Item.Build'): ['user1'],

    // User2 has read permission only
    Permission.fromId('hudson.model.Item.Read'): ['user2']
])

folder.addProperty(property)
folder.save()
