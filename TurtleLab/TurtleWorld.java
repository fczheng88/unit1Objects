import java.awt.Color;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.Dimension;

public class TurtleWorld
{   
    public Color makeColor()
    {   //makes a random color
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randColor = new Color(r,g,b);
        return randColor;
    }
    public boolean turtleOutOfBounds(Turtle turtle, int worldX, int worldY)
    {   //used to test if the turtle is exceeding the boundaries of the world
        if(Math.abs(turtle.getXPos()) > (worldX-50))
        {
            //System.out.println("xpos");
            return true;
        }
        if(Math.abs(turtle.getYPos()) > (worldY-50))
        {
            //System.out.println("ypos");
            return true;
        }
        return false;
    
    } 
    public static void main(String args[])
    throws InterruptedException
    {
        //Define variables    
        int angle = 121;
        int length = 1;
        int turtleiter = 1000; //or until the turtle hits the boundary
        int totaliter = 10;
        int delay = 1;
        int incwidth = 75; //hwo many iterations per increase of width
        
        
        //World dimensions
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screensize.getWidth();
        int height = (int) screensize.getHeight();
        int worldX = width;
        int worldY = height-50;       
        
        
        TurtleWorld methods = new TurtleWorld();
        World turtleWorld = new World(worldX,worldY);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        
        //initial turtle settings
        turtle.turn(0*angle);
        turtle1.turn(angle);
        turtle2.turn(2*angle);
        turtle3.turn(3*angle);
        turtle.setPenColor(methods.makeColor());
        turtle1.setPenColor(methods.makeColor());
        turtle2.setPenColor(methods.makeColor());
        turtle3.setPenColor(methods.makeColor());
        turtle.penDown();
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
        for(int j=1; j<=totaliter; j++)
        {
            int actualiter = 0; //counts actual number of iterations
            
            turtle.setPenWidth(1);
            turtle1.setPenWidth(1);
            turtle2.setPenWidth(1);
            turtle3.setPenWidth(1);
            
            for(int i=1; i<=turtleiter; i++){
                
                if(methods.turtleOutOfBounds(turtle, worldX, worldY))
                {
                    break;
                }
                //System.out.println(turtle.getYPos());
                //System.out.println(worldY);
                turtle.setPenColor(methods.makeColor());
                turtle.forward(i*length);
                turtle.turn(angle);
                turtle.setPenWidth(i/incwidth);
                turtle1.setPenColor(methods.makeColor());
                turtle1.forward(i*length);
                turtle1.turn(angle);
                turtle1.setPenWidth(i/incwidth);
                turtle2.setPenColor(methods.makeColor());
                turtle2.forward(i*length);
                turtle2.turn(angle);
                turtle2.setPenWidth(i/incwidth);
                turtle3.setPenColor(methods.makeColor());
                turtle3.forward(i*length);
                turtle3.turn(angle);
                turtle3.setPenWidth(i/incwidth);
                
                actualiter +=1;
                
                Thread.sleep(delay);            
                
            }
            turtle.setPenColor(Color.WHITE);
            turtle1.setPenColor(Color.WHITE);
            turtle2.setPenColor(Color.WHITE);
            turtle3.setPenColor(Color.WHITE);
            for(int i=1; i<=actualiter; i++){
                
                
                //System.out.println(turtle.getYPos());
                //System.out.println(worldY);
                turtle.turn(-angle);
                turtle.backward((actualiter-i)*length+1);
                turtle.setPenWidth((actualiter-i)/incwidth+5);
                
                turtle1.turn(-angle);
                turtle1.setPenWidth((actualiter-i)/incwidth+5);
                turtle1.backward((actualiter-i)*length+1);
                
                turtle2.turn(-angle);
                turtle2.setPenWidth((actualiter-i)/incwidth+5);
                turtle2.backward((actualiter-i)*length+1);
                
                turtle3.turn(-angle);           
                turtle3.setPenWidth((actualiter-i)/incwidth+5);
                turtle3.backward((actualiter-i)*length+1);
                
                
                Thread.sleep(delay);            
                
            }
        }
    }
}
