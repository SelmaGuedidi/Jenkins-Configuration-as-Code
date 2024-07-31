def folder2 = 'folder2'

authorization {
    // Admin has full permissions
    permission('hudson.model.Item.Read', 'admin', folder2)
    permission('hudson.model.Item.Configure', 'admin', folder2)
    permission('hudson.model.Item.Create', 'admin', folder2)
    permission('hudson.model.Item.Delete', 'admin', folder2)

    // User1 has read and build permissions
    permission('hudson.model.Item.Read', 'user1', folder2)
    permission('hudson.model.Item.Build', 'user1', folder2)

    // User2 has read permission only
    permission('hudson.model.Item.Read', 'user2', folder2)
}