/**
 * 出现在dao中的内部类，用来处理ResultSet
 */
private static class $Handler implements ResultSetHandler<List<Entity>> {

    @Override
    public List<Entity> handle(final ResultSet rs) throws SQLException {
        if (!rs.next()) {
            return Collections.emptyList();
        }

        final List<Entity> $rows = new ArrayList<>();
        do {

            $Preprocess(data);

            $rows.add(data);
        } while (rs.next());
        return $rows;
    }
}