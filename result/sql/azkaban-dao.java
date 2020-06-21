/**
 * azkaban项目中dao查询
 */
public List<Entity> fetch(final int $params...) throws $Exception {
    try {
        return this.dbOperator.query($query,new $Handler(), $params);
    } catch (final SQLException e) {
        throw new $Exception("...", e);
    }
}

