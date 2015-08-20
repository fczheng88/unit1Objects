import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        Random rand = new Random();
        for(int i=1; i<100; i++){
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randColor = new Color(r,g,b);
            if(i%2==0){
                turtle.penUp();
            }
            turtle.setPenColor(randColor);
            turtle.forward(i*5);
            turtle.turn(90);
            turtle.penDown();
        }
    }
}
