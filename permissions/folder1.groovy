import com.cloudbees.hudson.plugins.folder.properties.AuthorizationMatrixProperty
def folder = Jenkins.instance.getItem('folder1')

def property = folder.getProperties().get(AuthorizationMatrixProperty.class)

// If property doesn't exist, create a new one
if (property == null) {
    property = new AuthorizationMatrixProperty()
    folder.addProperty(property)
}

// Admin has full permissions
property.add(Permission.fromId('hudson.model.Item.Read'), 'admin')
property.add(Permission.fromId('hudson.model.Item.Configure'), 'admin')
property.add(Permission.fromId('hudson.model.Item.Create'), 'admin')
property.add(Permission.fromId('hudson.model.Item.Delete'), 'admin')

// User1 has read and build permissions
property.add(Permission.fromId('hudson.model.Item.Read'), 'user1')
property.add(Permission.fromId('hudson.model.Item.Build'), 'user1')

// User2 has read permission only
property.add(Permission.fromId('hudson.model.Item.Read'), 'user2')

folder.save()
