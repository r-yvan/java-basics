package Starting;

public class Loops {
    public static void main(String[] args) {

//        WHILE LOOP

        byte r = 0;
        while (r < 4) {
            System.out.println("Hello Java!!" + r);
            r++;
        }

//        FOR LOOP

        byte c = 0;
        for (c = 0; c <= 10; c++) {
            System.out.println("Rubuto Yvan is Learning Java!!");
        }

//        DO - WHILE LOOP

        int h = 0;
        do {
            System.out.println("Rubuto Yvan is Learnig Java!!");
            h++;
        }
        while (h <= 10);

//        SIMPLE EXERCISE

//        PRINTING A RECTANGLE

        int i = 0;
        int j = 0;
        for (i = 0; i <= 10; i++) {
            for (j = 0; j <= 10; j++) {
                System.out.print(" x ");
            }
            System.out.println();
        }
    }
}
