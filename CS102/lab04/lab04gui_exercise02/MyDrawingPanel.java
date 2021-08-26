import javax.swing.*;
import java.awt.*;
/**
 * MYDrawingPanel Class
 * @author Arman Engin SUCU
 * @version 04/01/2020
 */ 
public class MyDrawingPanel extends JPanel
{
   // properties
   private  int width;
   private  int height;
   
   
   // constructors
   // Default Constructor
   public MyDrawingPanel()
   {
      width = 300;
      height = 250;
      setBackground( Color.yellow);
      setPreferredSize( new Dimension(300, 250));
   }
   // Parametrized Constructor
   public MyDrawingPanel( int width, int height)
   {
      
      this.width = width;
      this.height = height;
      setBackground( Color.yellow);
      setPreferredSize( new Dimension( width, height)); 
   }
   
   /*
    * setBackgroundColor method that sets the background color
    * @param color as a type of Color
    */
   public void setBackgroundColor( Color color)
   {
      setBackground( color);
   }
   
   //@Override
   /*
    * paintComponent method that creates graphics
    * @param g as a type of Graphics
    */
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawLine(350, 35, 305, 35);
      g.drawOval(50,50,50,50);
      g.drawString("Best", 355, 40);
      g.fillRect(0, 50, 100, 10);
   } 
}


