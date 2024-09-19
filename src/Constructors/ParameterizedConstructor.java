package Constructors;

class newResident {
    private String name;
    private String location;
    private int age;

    public newResident(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age = age;
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

public class ParameterizedConstructor {
    public static void main(String[] args) {
        newResident her = new newResident("Noella Irasubiza", "Kigali City", 21);

        her.getName();
        her.getAge();
        her.getLocation();
    }
}
