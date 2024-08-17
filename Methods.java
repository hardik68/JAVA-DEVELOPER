// Example of Methods in java 

class Computer 
{
    public void playMusic()
    {
     System.out.println("Music Playing..");                               // this is where you have to define what is
                                                                           //   the behaviour of paticular method 
    }
    public String getMeApen(int cost)
    {
        if(cost>=10)
            return "Pen";
        
            return "Nothing";
        }
    
}
public class Methods {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeApen(2);
        System.out.println(str);
        
    }
    
}
