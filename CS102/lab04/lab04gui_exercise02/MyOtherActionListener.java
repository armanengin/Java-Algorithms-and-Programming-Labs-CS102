import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * MyOtherActionListener Class
 * @author Arman Engin SUCU
 * @version 04/01/2020
 */ 

class MyOtherActionListener implements ActionListener
{
   // properties
   JButton button;
   
   // constructors
   public MyOtherActionListener( JButton button)
   {
      this.button = button;
   }
   
   // methods
   public void actionPerformed(ActionEvent e)
   {
      System.out.println( "Button pressed!");
      if ( button.getLabel().equals( "OK"))
      {
         button.setLabel( "Maybe");
      }
      else if ( button.getLabel().equals( "Maybe"))
      {
         button.setLabel( "OK");
      }
   }
}      
