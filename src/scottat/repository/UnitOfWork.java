package scottat.repository;

import javax.persistence.EntityManager;

public interface UnitOfWork {
  EntityManager getEntityManager();
  void commit();
  void rollback();
}
