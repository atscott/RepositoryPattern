package scottat.models;


public class Account {

  private String userName;
  private String firstName;
  private String lastName;
  private String email;
  private int age;

  public boolean hasUserName(String desiredUserName) {
    return this.userName.equals(desiredUserName);
  }

  public boolean ageBetween(int minAge, int maxAge) {
    return age >= minAge && age <= maxAge;
  }
}
