package Objects;
class Greetings {
    String name = "Rubuto Yvan";
    public void greet() {
        System.out.print("Hello " + name + " !!");
    }
}

public class Object {
    public static void main(String[] args) {
        Greetings myname = new Greetings();
        myname.greet();
    }
}
