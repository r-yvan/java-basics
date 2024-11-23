package AccessModifiers.TestingModifiers;
import AccessModifiers.Protected;

public class TestB extends Protected {
  public void returnMarks() {
    System.out.println(myName);
//    Accessible only in the subclass through inheritance in a different package
  }
}
