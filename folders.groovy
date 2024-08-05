folder('folder1') {
    description('Folder containing the front project')
    authorization {
         permission('hudson.model.Item.Discover', 'admin')
                 permission('hudson.model.Item.Discover', 'user1')
            }
}
folder('folder2') {
    description('Folder containing the front project')
    authorization {
                permission('hudson.model.Item.Discover', 'user1')
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

folder('example-3') {
    authorization {
        permissionAll('user1')
    }
}