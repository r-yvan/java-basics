package Constructors;

class Resident {
    private String name;
    private String location;
    private int age;

//  Default Constructor

    public Resident() {
        name = "John Doe";
        location = "New York City";
        age = 24;
    }

    public int setNameLocationAge(String name, String location, int age) {
        int i = 1;
        while (i < 3) {
            this.name = name;
            i++;
            this.location = location;
            i++;
            this.age = age;
            i++;
            if (i == 3) return 0;
        }
        return 1;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public String getLocation() {
        System.out.println(this.location);
        return this.location;
    }

    public int getAge() {
        System.out.println(this.age);
        return this.age;
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {

        Resident me = new Resident();
        me.setNameLocationAge("Rubuto Yvan", "Kigali City", 16);

        me.getName();
        me.getAge();
        me.getLocation();
    }
}
