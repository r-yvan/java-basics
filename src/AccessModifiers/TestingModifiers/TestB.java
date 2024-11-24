package AccessModifiers.TestingModifiers;

import AccessModifiers.Protected;

public class TestB extends TestA {
  public static void main(String[] args) {
    Protected d = new Protected();
    System.out.println(d.myName);
  }
}
