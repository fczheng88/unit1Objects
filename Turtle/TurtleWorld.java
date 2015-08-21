import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
       
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle1 = new Turtle(turtleWorld);
        //Turtle turtle2 = new Turtle(turtleWorld);
        //Turtle turtle3 = new Turtle(turtleWorld);
        turtle.turn(0);
        //turtle1.turn(180);
        //turtle2.turn(180);
        //turtle3.turn(270);
        turtle.setPenColor(Color.BLUE);
        //turtle1.setPenColor(Color.RED);
        //turtle2.setPenColor(Color.GREEN);
        //turtle3.setPenColor(Color.YELLOW);
        turtle.penDown();
        //turtle1.penDown();
        //turtle2.penDown();
        //turtle3.penDown();
        Random rand = new Random();
        for(int i=1; i<101; i++){
            //float r = rand.nextFloat();
            //float g = rand.nextFloat();
            //float b = rand.nextFloat();
            //Color randColor = new Color(r,g,b);
            
            if(i%2==0){
                turtle.penUp();
            }
            //if((i+1)%2==0){
            //    turtle1.penUp();
            //}
            //if((i+2)%2==0){
            //    turtle2.penUp();
            //}
            //if((i+3)%2==0){
            //    turtle3.penUp();
            //}
            
            //turtle.setPenColor(randColor);
            turtle.forward(i*5);
            turtle.turn(90);
            turtle.penDown();
            //turtle1.forward(i*5-5);
            //turtle1.turn(90);
            //turtle1.penDown();
            //turtle2.forward(i*5);
            //turtle2.turn(45);
            //turtle2.penDown();
            //turtle3.forward(i*5);
            //turtle3.turn(45);
            //turtle3.penDown();
            
            
            
        }
    }
}
