package Encapsulation;

class Product {
    private int id;
    private String name;
    private static int price;

//      1st Approach
//
//    public int getId(Product object) {
//        System.out.println(object.id);
//        return object.id;
//    }
//
//    public String getName(Product object) {
//        System.out.println(object.name);
//        return object.name;
//    }
//
//    public int getPrice(Product object) {
//        System.out.println(object.price);
//        return object.price;
//    }
//
//    public void setId(int id, Product object) {
//        object.id = id;
//    }
//
//    public void setName(String name, Product object) {
//        object.name = name;
//    }
//
//    public void setPrice(int price, Product object) {
//        object.price = price;
//    }

//      2nd Approach : Recommended

//      This Keyword is used to avoid passing the object into the getters and setters
//      functions in order to set or get values for the private variables

    public int getId() {
        System.out.println(this.id);
        return this.id;
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public int getPrice() {
        System.out.println(this.price);
        return this.price;
    }

    public void setName(String word) {
        this.name = word;
    }

    public void setId(int num) {
        this.id = num;
    }

    public void setPrice(int num) {
        this.price = num;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

//        ENCAPSULATION

//        For 1st Approach

//        Product avangard = new Product();
//        avangard.setId(12, avangard);
//        avangard.setName("Objekt 4022 Avangard", avangard);
//        avangard.setPrice(80_000_000, avangard);

//        avangard.getId(avangard);
//        avangard.getName(avangard);
//        avangard.getPrice(avangard);

//        For 2nd Approach

        Product avangard = new Product();
        avangard.setName("Objekt 4022 Avangard");
        avangard.setPrice(80_000_000);
        avangard.setId(12);

        avangard.getId();
        avangard.getName();
        avangard.getPrice();
    }
}
