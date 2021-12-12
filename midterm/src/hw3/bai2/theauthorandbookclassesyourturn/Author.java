package hw3.bai2.theauthorandbookclassesyourturn;

// 2.3

public class Author {
  private String name;
  private String email;
  private char gender;

  public Author(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String toString() {
    return "Author [name=" + name + ", email=" + email + "]";
  }
}
