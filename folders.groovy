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
