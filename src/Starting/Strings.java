package Starting;

public class Strings {
    public static void main(String[] args) {
//        STRINGS

        String my_name = "NKILIYE RUBUTO Yvan";

//        This String is a class however you do
//        not follow the normal way
//        of creating the objects to make the variables and by
//        default strings are Immutable i.e can not be changed

//        You can access multiple methods from String class as
//        the variable you create behaves as an objects of that
//        class

        System.out.println(my_name.concat(" Y2A "));

//        To create a Mutable string you can use StringBuffer or StringBuilder

        StringBuffer myName = new StringBuffer();

        myName.append("Rubuto Yvan");

//        To add content in the newly made object you have to use the
//        methods like append as you have seen

//        You can access multiple methods from String class as
//        the variable you create behaves as an objects of that
//        class

        System.out.println(myName);
        System.out.println(myName.capacity());
        System.out.println(myName.length());
        myName.setLength(15);
        System.out.println(myName);
    }
}
