folder('folder2') {
    properties {
        authorization {
            // Admin has full permissions
            permission('hudson.model.Item.Read', 'admin')
            permission('hudson.model.Item.Configure', 'admin')
            permission('hudson.model.Item.Create', 'admin')
            permission('hudson.model.Item.Delete', 'admin')
            permission('hudson.model.Item.Build', 'admin')
            permission('hudson.model.Item.CANCEL', 'admin')
           

            // User1 has read and build permissions
            permission('hudson.model.Item.Read', 'user1')
            permission('hudson.model.Item.Build', 'user1')

            // User2 has read permission only
            permission('hudson.model.Item.Read', 'user2')
        }
    }
}
