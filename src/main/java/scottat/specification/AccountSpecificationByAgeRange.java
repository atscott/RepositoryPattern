package scottat.specification;

import scottat.models.Account;
import scottat.repository.Specification;
import scottat.repository.SqlSpecification;

public class AccountSpecificationByAgeRange implements Specification<Account>, SqlSpecification
{

  private int minAge;
  private int maxAge;

  public AccountSpecificationByAgeRange(int minAge, int maxAge)
  {
    super();
    this.minAge = minAge;
    this.maxAge = maxAge;
  }

  @Override
  public boolean specified(Account account)
  {
    return account.ageBetween(minAge, maxAge);
  }

  @Override
  public String toSqlClauses()
  {
    return String.format("age between %s and %s", minAge, maxAge);
  }

}
