folder('folder1') {
    description('Folder containing the front project')

    authorization {
         permission('hudson.model.Item.Discover', 'USER:admin')
                 permission('hudson.model.Item.Discover', 'USER:user1')
            }
}
folder('folder2') {
    description('Folder containing the front project')
    properties {
    authorizationMatrix {
            permissions([
        'hudson.model.Item.Build:user1',
        'hudson.model.Item.Cancel:Build:user1',
        'hudson.model.Item.Discover:Build:user1',
        'hudson.model.Item.Read:Build:user1',
        'hudson.model.Item.Workspace:Build:user1'
      ])
            inheritanceStrategy {
                nonInheriting()
            }
}
}
}
folder('user3-folder') {
            description('Folder for user1')
            displayName('User1 Folder')
            authorization {
                permissions('USER:user1', [
            'hudson.model.Item.Create',
            'hudson.model.Item.Discover'
        ])
            }
        }

folder('example-3') {
    authorization {
        permissionAll('USER:user1')
    }
}