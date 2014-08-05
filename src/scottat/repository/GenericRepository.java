package scottat.repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by atscott on 1/27/14.
 */
public interface GenericRepository<T>
{
  void add(T item);

  void add(Collection<T> items);

  void delete(T item);

  void delete(Collection<T> items);

  void update(T item);
}
