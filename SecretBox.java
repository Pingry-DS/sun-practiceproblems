public class SecretBox<T> extends Box{

  private String password;
  private T hiddenCompartment;
  public SecretBox(String password, T contents, T hiddenContents){
    this.password = password;
    this.setContents(contents);
    hiddenCompartment = hiddenContents;
  }

  public T seeHiddenCompartment(String pass){
    if (pass.equals(password)){
      return hiddenCompartment;
    }
    return "Incorrect password";
  }
}
