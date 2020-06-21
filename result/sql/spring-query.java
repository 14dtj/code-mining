/**
 * 从数据库中根据参数查找对应的数据列表
 */
public List<Entity> find(Entity $entity) {

		return entityManager.createQuery($query)
				.setParameter($parameter, $entity)
				.getResultList();
}

