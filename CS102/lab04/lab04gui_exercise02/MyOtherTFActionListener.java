import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * MyOtherTFActionListener Class
 * @author Arman Engin SUCU
 * @version 04/01/2020
 */ 
public class MyOtherTFActionListener implements ActionListener
{
   // properties
   JTextField tf;
   JLabel label;
   
   // constructors
   public MyOtherTFActionListener( JTextField tf, JLabel label)
   {
      this.tf = tf;
      this.label = label;
   }
   
   // methods
   public void actionPerformed( ActionEvent e)
   {
      System.out.println( "TextField enter key pressed");
      System.out.println( tf.getText());
      label.setText( tf.getText());
   }
}
