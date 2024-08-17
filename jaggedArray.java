public class jaggedArray {
    public static void main(String[] args) {
        int num[][] = new int[3][]; // jagged array
        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10); // assinging the values.

            }

        }
        for (int n[] : num) { // n is not the simple variable here its an array a single dimensional array.
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();

        }




    }
    
}
// int nums [][][]=new int [2][3][4] // this is 3d array .