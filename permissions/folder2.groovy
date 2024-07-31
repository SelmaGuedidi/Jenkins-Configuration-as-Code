folder('folder2') {
    properties {
        authorizationMatrix {
            // Admin has full permissions
            permission('hudson.model.Item.Read', 'admin')
            permission('hudson.model.Item.Configure', 'admin')
            permission('hudson.model.Item.Create', 'admin')
            permission('hudson.model.Item.Delete', 'admin')
            permission('hudson.model.Item.Build', 'admin')
            permission('hudson.model.Item.CANCEL', 'admin')
            permission('hudson.model.Item.WORKSPACE', 'admin')
            permission('hudson.model.Item.EXTENDED_READ', 'admin')
            permission('hudson.model.Run.DELETE', 'admin')
            permission('hudson.model.Run.UPDATE', 'admin')
            permission('hudson.model.View.READ', 'admin')
            permission('hudson.model.View.CREATE', 'admin')
            permission('hudson.model.View.CONFIGURE', 'admin')
            permission('hudson.model.View.DELETE', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.CREATE', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.DELETE', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.MANAGE_DOMAINS', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.UPDATE', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.VIEW', 'admin')

            // User1 has read and build permissions
            permission('hudson.model.Item.Read', 'user1')
            permission('hudson.model.Item.Build', 'user1')

            // User2 has read permission only
            permission('hudson.model.Item.Read', 'user2')
        }
    }
}
