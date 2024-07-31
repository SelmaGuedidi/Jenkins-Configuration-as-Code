folder('folder1') {
    properties {
        authorization {
            // Admin has full permissions
            permission('hudson.model.Item.Read', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.Update', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.Create', 'admin')
            permission('com.cloudbees.plugins.credentials.CredentialsProvider.Delete', 'admin')
            permission('hudson.model.Item.Build', 'admin')
            permission('hudson.model.Item.Cancel', 'admin')
           

            // User1 has read and build permissions
            permission('hudson.model.Item.Read', 'user1')
            permission('hudson.model.Item.Build', 'user1')

            // User2 has read permission only
            permission('hudson.model.Item.Read', 'user2')
        }
    }
}