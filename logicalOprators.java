public class logicalOprators {
    
public static void main(String[] args) {
    int x = 7;
    int y = 5;
    int a = 5;
    int b = 9;
    boolean r1 = x>y && a>b; // flase
    boolean r2 = x>y && a<b; // true
    boolean r3 = x>y || a<b; // true
    boolean r4 = x>y || a<b; // true
// And - both the oprators should be true result will be true .
// Or - one of the oprators should be true result will be true .
// not oprator is just opposite of true result if the result is true then its flase .

boolean result = a>b; // true 
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);
    System.out.println(!result);
}

}