folder('folder1') {
    description('Folder containing the front project')
    authorization {
         permission('USER:hudson.model.Item.Discover', 'admin')
                 permission('USER:hudson.model.Item.Discover', 'user1')
            }
}
folder('folder2') {
    description('Folder containing the front project')
    authorization {
                permission('USER:hudson.model.Item.Discover', 'user1')
            }
}
folder('user3-folder') {
            description('Folder for user1')
            displayName('User1 Folder')
            authorization {
                permissions('user1', [
            'USER:hudson.model.Item.Create',
            'USER:hudson.model.Item.Discover'
        ])
            }
        }

folder('example-3') {
    authorization {
        permissionAll('USER:user1')
    }
}