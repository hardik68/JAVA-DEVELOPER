class Student1{
    // they are instant variables because they belong to a class not to a method 
    int rollNo;
    String name;
    int marks;
}
public class forloop {
    public static void main(String[] args) {
        // initalization ,condition , increment/decrement(when the loop will end)
        // for(int i = 4;i>=1;i--){
        //     System.out.println("Hi " + i);
        // }

        // for(int i =1; i<=4;i++){
        //     System.out.println("Hi " + i);
        // }
        // for(int i=0;i<=3;i++){
        //     System.out.println("Hi " + i);
        // }
        // for(int i=0;i<4;i++){
        //     System.out.println("Hi " + i);
        // }
        // with days print the number of hours
        // hours 
        for(int i=1;i<=7;i++){
            System.out.println("DAY " + i);

            for(int j=1;j<=9;j++)
            {
                System.out.println(" " + (j+8) + "-" +(j+9));
            }
        }


    }
    
}
