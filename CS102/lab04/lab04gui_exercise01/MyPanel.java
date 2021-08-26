import javax.swing.*;
import java.awt.*;
/**
 *  
 * @author Arman Engin SUCU
 * @version 01.02.2020
 */ 
public class MyPanel extends JPanel
{
   // properties

   // constructors
   public MyPanel()
   {
      JButton b;
       //setPreferredSize( new Dimension( 200, 200) );
      
      setLayout( new BorderLayout( 500 , 500 ) );
      setSize( 200, 200);
      b = new JButton( "OK");
      add(new JLabel("inþ olur"), BorderLayout.SOUTH);
      add( new JLabel( "Welcome to ZOOM" ),BorderLayout.WEST );           
      add( b,BorderLayout.EAST);
      add( new JButton( "Good luck with Maths! "),BorderLayout.CENTER );      
      add( new JTextField( 25),BorderLayout.NORTH );     
      setVisible(true);
   }

   // methods
     
}