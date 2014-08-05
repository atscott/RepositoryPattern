package scottat.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by atscott on 1/27/14.
 */
public class InMemoryRepository<T> implements GenericRepository<T>
{
  private List<T> items;

  public InMemoryRepository()
  {
    items = new ArrayList<>();
  }

  @Override
  public void add(T item)
  {
    items.add(item);
  }

  @Override
  public void add(Collection<T> items)
  {
    this.items.addAll(items);
  }

  @Override
  public void delete(T item)
  {
    items.remove(item);
  }

  @Override
  public void delete(Collection<T> items)
  {
    this.items.removeAll(items);
  }

  @Override
  public void update(T item)
  {
    items.set(items.indexOf(item), item);
  }

  public List query(Specification... specifications)
  {
    List<T> results = new ArrayList<>();
    for (T item : items)
      if (itemMatchesSpecifications(item, specifications))
        results.add(item);

    return results;
  }

  private boolean itemMatchesSpecifications(T item, Specification... specifications)
  {
    for (Specification specification : specifications)
      if (!specification.specified(item))
        return false;
    return true;
  }

}
