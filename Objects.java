class Calculator{
int a;

public int add(int n1,int n2){
        int r = n1 + n2 ;
        return r;
    }
}
public class Objects 
{
    public static void main(String [] args) 
    {
        
        int num1 = 4;
        int num2 = 5;
        //int result = num1 + num2;
        //System.out.println(result);

        Calculator calc =new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}





// Object Oriented Programming 
// Properties and Behaviour .

// Every object will have property and will also have behaviour .


//class
//Everything has to be done with the help of object in java 
