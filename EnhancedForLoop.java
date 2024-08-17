public class EnhancedForLoop {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10); // assinging the values.

            }

        }
         for (int n[] : nums) { // n is not the simple variable here its an array a single dimensional array.
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
         }
    }
        }