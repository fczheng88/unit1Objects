import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        
        for(int i=1;i<=5;i++){
            int die = rnd.nextInt(6);
            System.out.println(die);
        }
    }
}