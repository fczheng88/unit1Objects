import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static Color makeColor(Random rand)
    {   //Creates and returns a random color
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color color = new Color(r,g,b);
        return color;
    }
    public static void main(String args[])
    throws InterruptedException
    {
       
        World turtleWorld = new World(700,700);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Random rand = new Random();
        int howBig = 1;
        int iterations = 1000;
        int angle = 129;
        
        turtle.turn(0);
        turtle1.turn(angle);
        turtle2.turn(2*angle);
        turtle3.turn(3*angle);
        turtle.setPenColor(makeColor(rand));
        turtle1.setPenColor(makeColor(rand));
        turtle2.setPenColor(makeColor(rand));
        turtle3.setPenColor(makeColor(rand));
        turtle.penDown();
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
        
        
        for(int i=1; i<=iterations; i++){
            Thread.sleep(50);
            
            turtle.setPenColor(makeColor(rand));
            turtle.forward(i*howBig);
            turtle.turn(angle);
            
            turtle1.setPenColor(makeColor(rand));
            turtle1.forward(i*howBig);
            turtle1.turn(angle);
            
            turtle2.setPenColor(makeColor(rand));
            turtle2.forward(i*howBig);
            turtle2.turn(angle);
            
            turtle3.setPenColor(makeColor(rand));
            turtle3.forward(i*howBig);
            turtle3.turn(angle);
            
            
                       
            
            
        }
    }
}
