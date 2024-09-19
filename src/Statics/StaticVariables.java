package Statics;

class Product {
    int id;
    String name;
    static int price;

    public static void menu(Product object) {
        System.out.println("| " + object.id + " | " + object.name + " | " + price + " |");
    }
}

public class StaticVariables {
    public static void main(String[] args) {
//        STATIC VARIABLE AND METHOD

        Product cake = new Product();
        cake.id = 1;
        cake.name = "Creamed Cake";

        Product biscuit = new Product();
        biscuit.id = 2;
        biscuit.name = "Glucose";

        Product.price = 6000;

//        It becomes the same for all objects as it is static

        System.out.println(cake.price);
        System.out.println(biscuit.price);

        biscuit.price = 700;

        System.out.println(cake.price);
        System.out.println(biscuit.price);

//        It seems like if you change on one object the result changes
//        even on the other

        System.out.println("It is known that Glucose Biscuit costs " + biscuit.price + " on the market");
        System.out.println("It is also known that Creamed Cake costs " + cake.price + " on the market");

        System.out.println();
        System.out.println();

        System.out.println("Please check on the Table given if you doubt!!");
        Product.menu(biscuit);
        Product.menu(cake);
    }
}
