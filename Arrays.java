public class Arrays{
    public static void main(String[] args) {

       // dynamic array 
       int num[] = new int[4];
       //int num[] = {3,7,2,4};
       //i got an array with the four values.
        num[0] = 4;
        num[1] = 8;
        num[2] = 3;
        num[3] = 9;
        // System.out.println(num[0]);
        // System.out.println(num[1]);
        // System.out.println(num[2]);
        // System.out.println(num[3]);

       // we are printing this value multiple times so we can use a loop 
       for (int i=0;i<4;i++){
        System.out.println(num[i]);
       }
    }
}