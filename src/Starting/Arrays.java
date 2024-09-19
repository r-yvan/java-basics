package Starting;

public class Arrays {
    public static void main(String[] args) {
        int arr [] = {2, 3, 4, 5};
        int arr1 [] = new int[4];
        int md_arr [][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                md_arr [i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(md_arr [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

//        USING ENHANCED FOR LOOP

//        This Loop returns only the first element in an array so It will
//        return the first array in a multi-dimensional array hence being
//        able to return other elements in that sub-array

        for (int n [] : md_arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
