import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {   
        int rolls = 5;
        //Option A
        Random rnd = new Random();
        
        for(int i=1;i<=rolls;i++){
            int die = rnd.nextInt(6)+1; //number between 0 and 5 and add 1
            System.out.println(die);
        }
        
        //Option B
        double die2 = Math.random(); //double between 0 and 1
        for(int i=1;i<=rolls;i++){
            die2 = Math.random();
            die2 += 1;
            
            System.out.println((int)(die2));
        }
        
        
        
        
        
        
        
        
    }
}