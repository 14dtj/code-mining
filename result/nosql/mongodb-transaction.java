/**
 * 使用mongodb的事务功能
 */

return operations.update(Process.class).matching(Query.query(Criteria.where($param)))
        .apply($update).first() //
        .then(Mono.just(process));