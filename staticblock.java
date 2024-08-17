class Mobile{
    String brand;
    int price;
    static String name;

    public Mobile(){
        brand = ""; // empty string 
        price = 200;
        name ="phone";
    }


    public void show(){
        System.out.println(brand + ":" + price + ": " + name);
    } // did some changes 
   // this is used
}
public class staticblock{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhones";

   
        obj1.show(); 
        // now to instantiate the variables from here ,what do we do .
        //Ofcourse we can instantiate the from this block but what if you 
        //want to instantiate the variable from the line Mobile1 obj1 = new
        //Mobile(); if you want to give some value   
    }   
}
