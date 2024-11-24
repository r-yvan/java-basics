package AccessModifiers.TestingModifiers;

import AccessModifiers.Private;
import AccessModifiers.Protected;
import AccessModifiers.Public;

public class TestA {
  public static void main(String[] args) {
    Public a = new Public();
    System.out.println(a.marks);
//    Public is always accessible anywhere

//    Private b = new Private();
//    System.out.println(b.age);
//    Brings an error meaning not used anywhere in different class
    
//    Protected c = new Protected();
//    System.out.println(c.myName);
//    Brings an error due to different package and in non-subclass
  
  
  }
}
