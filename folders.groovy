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
            entries {
            user {
              name('user1')
              permissions([ 'Job/Build', 'Job/Configure', 'Job/Delete', 'Job/Read' ])
            }
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