folder('folder1') {
    description('Folder containing the front project')
    authorization {
                permission('hudson.model.Item.Read:user1')
                permission('hudson.model.Item.Build:user1')
                permission('hudson.model.Item.Create:user1')
                permission('hudson.model.Item.Delete:admin')
            }
}
folder('folder2') {
    description('Folder containing the front project')
    authorization {
                permission('hudson.model.Item.Read:user1')
                permission('hudson.model.Item.Build:user1')
                permission('hudson.model.Item.Create:user1')
                permission('hudson.model.Item.Delete:admin')
            }
}
folder('user3-folder') {
            description('Folder for user1')
            displayName('User1 Folder')
            authorization {
                permissions('user1', [
            'hudson.model.Item.Create',
            'hudson.model.Item.Discover'
        ])
            }
        }