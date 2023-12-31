package dao;

import hibernatecurso.hibernatecurso.HibernateUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class DaoGeneric<T> {
	
	private EntityManager entityManager = HibernateUtil.getEntiManager();
	
	
	
	public void salvar(T entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
	}
	
	public T pesquisar(T entidade) {
		Object id = HibernateUtil.getPrimaryKey(entidade);
		T t = (T) entityManager.find(entidade.getClass(), id);
		
		return t;
	}
	
	public T pesquisar(Long id, Class<T> entidade) {

		T t = (T) entityManager.find(entidade, id);
		
		return t;
	}
	
}
