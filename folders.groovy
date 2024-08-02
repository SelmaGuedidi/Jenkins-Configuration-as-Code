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