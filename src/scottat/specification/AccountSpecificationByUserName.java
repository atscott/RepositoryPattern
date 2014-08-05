package scottat.specification;

import scottat.models.Account;
import scottat.repository.Specification;
import scottat.repository.SqlSpecification;

public class AccountSpecificationByUserName implements Specification<Account>, SqlSpecification
{

  private String desiredUserName;

  public AccountSpecificationByUserName(String desiredUserName)
  {
    super();
    this.desiredUserName = desiredUserName;
  }

  @Override
  public boolean specified(Account account)
  {
    return account.hasUserName(desiredUserName);
  }

  @Override
  public String toSqlClauses()
  {
    return String.format("username = %s", desiredUserName);
  }

}

