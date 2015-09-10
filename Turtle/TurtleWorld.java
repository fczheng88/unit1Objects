import java.awt.Color;
import java.util.Random;

public class TurtleWorld
<<<<<<< HEAD
{
    public static Color makeColor(Random rand)
    {   //Creates and returns a random color
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color color = new Color(r,g,b);
        return color;
=======
{   
    public static Color makeColor()
    {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randColor = new Color(r,g,b);
        return randColor;
    }
    public static boolean turtleOutOfBounds(Turtle turtle, int worldX, int worldY)
    {
        if(Math.abs(turtle.getXPos()) > worldX)
        {
            System.out.println("xpos");
            return false;
        }
        if(Math.abs(turtle.getYPos()) > worldY)
        {
            System.out.println("ypos");
            return false;
        }
        return true;
        
>>>>>>> origin/master
    }
    public static void main(String args[])
    throws InterruptedException
    {
<<<<<<< HEAD
       
        World turtleWorld = new World(700,700);
=======
        
    int angle = 121;
    int length = 1;
    int iter = 1000;
    int delay = 50;
    int incwidth = 75;
        
    int worldX = 1000;
    int worldY = 700;       
     
        
        World turtleWorld = new World(worldX,worldY);
>>>>>>> origin/master
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
<<<<<<< HEAD
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
=======
                
        turtle.turn(0*angle);
        turtle1.turn(angle);
        turtle2.turn(2*angle);
        turtle3.turn(3*angle);
        turtle.setPenColor(makeColor());
        turtle1.setPenColor(makeColor());
        turtle2.setPenColor(makeColor());
        turtle3.setPenColor(makeColor());
>>>>>>> origin/master
        turtle.penDown();
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
<<<<<<< HEAD
        
        
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
            
            
                       
=======
        Random rand = new Random();
        for(int i=1; i<=iter; i++){
            if(turtleOutOfBounds(turtle, worldX, worldY))
            {
                break;
            }
            System.out.println(turtle.getYPos());
            System.out.println(worldY);
            turtle.setPenColor(makeColor());
            turtle.forward(i*length);
            turtle.turn(angle);
            turtle.setPenWidth(i/incwidth);
            turtle1.setPenColor(makeColor());
            turtle1.forward(i*length);
            turtle1.turn(angle);
            turtle1.setPenWidth(i/incwidth);
            turtle2.setPenColor(makeColor());
            turtle2.forward(i*length);
            turtle2.turn(angle);
            turtle2.setPenWidth(i/incwidth);
            turtle3.setPenColor(makeColor());
            turtle3.forward(i*length);
            turtle3.turn(angle);
            turtle3.setPenWidth(i/incwidth);
>>>>>>> origin/master
            
            Thread.sleep(delay);            
            
        }
    }
}
