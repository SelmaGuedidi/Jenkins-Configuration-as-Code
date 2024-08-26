folder('frontend') {
    description('Folder containing the frontend project')
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
folder('backend') {
    description('Folder containing the backend project')
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
