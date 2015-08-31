import java.awt.Color;
import javax.swing.JFrame;


public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JFrame frame1 = new JFrame();
        frame.setSize(200,200);
        frame1.setSize(200,200);
        Color colour = new Color(50,100,150);
        Color brighter = colour.brighter();
        System.out.println(brighter);
        
        frame.getContentPane().setBackground(colour);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame1.getContentPane().setBackground(brighter);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}