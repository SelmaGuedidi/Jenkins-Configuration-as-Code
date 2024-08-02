folder('folder1') {
    description('Folder containing the front project')
    properties {
        authorization {
            permission('hudson.model.Item.Read', 'admin')
            permission('hudson.model.Item.Build', 'admin')
            permission('hudson.model.Item.Configure', 'admin')
            permission('hudson.model.Item.Delete', 'admin')

            permission('hudson.model.Item.Read', 'user1')
            permission('hudson.model.Item.Build', 'user1')
            permission('hudson.model.Item.Configure', 'user1')

            permission('hudson.model.Item.Read', 'user2')
            permission('hudson.model.Item.Build', 'user2')
        }
    }
}
folder('folder2') {
    description('Folder containing the front project')
    properties {
        authorization {
            permission('hudson.model.Item.Read', 'admin')
            permission('hudson.model.Item.Build', 'admin')
            permission('hudson.model.Item.Configure', 'admin')
            permission('hudson.model.Item.Delete', 'admin')

            permission('hudson.model.Item.Read', 'user1')
            permission('hudson.model.Item.Build', 'user1')
            permission('hudson.model.Item.Configure', 'user1')

            permission('hudson.model.Item.Read', 'user2')
            permission('hudson.model.Item.Build', 'user2')
        }
    }
}