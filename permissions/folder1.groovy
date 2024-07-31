def folder1 = 'folder1'

authorization {
    // Admin has full permissions
    permission('hudson.model.Item.Read', 'admin', folder1)
    permission('hudson.model.Item.Configure', 'admin', folder1)
    permission('hudson.model.Item.Create', 'admin', folder1)
    permission('hudson.model.Item.Delete', 'admin', folder1)

    // User1 has read and build permissions
    permission('hudson.model.Item.Read', 'user1', folder1)
    permission('hudson.model.Item.Build', 'user1', folder1)

    // User2 has read permission only
    permission('hudson.model.Item.Read', 'user2', folder1)
}