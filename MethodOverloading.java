class Demo
{
    public int add(int n1,int n2,int n3)
    {
     return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public double add(double n1,int n2)
    {
        return n1 + n2;
    }
}

public class MethodOverloading 
{
    public static void main(String[] args) 
    {
    Demo obj = new Demo();
    int result =obj.add(3,4,5);
    System.out.println(result);
}
}