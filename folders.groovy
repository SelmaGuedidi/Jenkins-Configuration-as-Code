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
           permissions {
                permission {
                    permission('hudson.model.Item.Build') // Example permission
                    user('user1')
                    allowed(true)
                }
                permission {
                    permission('hudson.model.Item.Cancel:Build') // Example permission
                    user('user1')
                    allowed(true)
                }
                // Add more permissions as needed
            }
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