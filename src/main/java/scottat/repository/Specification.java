package scottat.repository;

/**
 * Created by atscott on 1/27/14.
 */
public interface Specification<T>
{
  boolean specified(T item);
}
