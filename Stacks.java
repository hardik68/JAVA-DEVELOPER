class Stupid{
    int num =5; // num is the instance variable and n1 and n2 are local variable.
    public int add(int n1,int n2){
        return n1 + n2;
        // n1 and n2 are local variables .
        // just to reiterate thet are local variables 
        // and what do you mean by the local and diffrent types of variable we have 
    }
}

public class Stacks {
    int data = 10;
    public static void main(String[] args) {
        Stupid obj = new Stupid();
        Stupid obj1 = new Stupid ();
        int r1 =obj.add(3,4);
        //System.out.println(r1);
        obj.num=8;
        System.out.println(r1);
        System.out.println(obj1.num);
        System.out.println(obj.num);
    }
    
}
