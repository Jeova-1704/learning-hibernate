package hibernatecurso.hibernatecurso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
	
	private static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	private static void init() {
		try {
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("hibernate-curso");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntiManager() {
		return factory.createEntityManager();
	}
	
	public static Object getPrimaryKey(Object entity) { //Retorna um a key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}

}
