package br.com.alvarobatista.todolist.user;

public class UserModel {
  
  private String username;
  private String password;
  private String name;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  } 
}
