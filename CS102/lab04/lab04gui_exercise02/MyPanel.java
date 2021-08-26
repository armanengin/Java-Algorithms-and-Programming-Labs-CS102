import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * MyPanel Class
 * @author Arman Engin SUCU
 * @version 04/01/2020
 */ 
public class MyPanel extends JPanel implements ActionListener
{
   // properties
   JLabel     label;
   JTextField tf;
   JPanel     p;
   JButton b;

   // constructors
   public MyPanel()
   {
      
      // setPreferredSize( new Dimension( 100, 100) );
      setSize( 200, 200);
      setLayout( new FlowLayout() );
      
      label = new JLabel( "Welcome to ZOOM");
      add( label);
      
      // add( new Button( "Good luck with Maths! ") );

      // Second Part
      b = new JButton( "OK");
      add( b);
      b.addActionListener( new MyOtherActionListener( b) );
      
//      b.addActionListener( this );
//      b.addActionListener( new MyActionListener() );
     
      
//      b.addActionListener( new ActionListener() {
//         public void actionPerformed(ActionEvent e)
//         {
//            System.out.println( "Button pressed! ~ AL-Annon" );
//         }
//      });      
//      b.addActionListener( 
//          e -> System.out.println( "Button pressed! ~ LAMBDA" ) );
//    
      // Third Part
      tf = new JTextField( 25);
      add( tf );      
      tf.addActionListener( new MyOtherTFActionListener( tf, label));
      
      p = new JPanel();
      p.setBackground( Color.cyan);
      p.setPreferredSize( new Dimension( 200, 150) );
      add(p);
      
      JComponent component = new MyDrawingPanel();
      add( component);
   }

   // methods
   public void actionPerformed(ActionEvent e)
   {
      if ( e.getSource() != tf ) 
         System.out.println( "Button pressed!" );
      else
         System.out.println( "TF pressed!" );
      
      label.setText( tf.getText() );
   }
   
   // named inner class
   class MyActionListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.out.println( "Button pressed! ~ ALNIC" );
         
         // right way is to override paint
         
         // wrong way to do it
         Graphics g;
         g = p.getGraphics();
         g.drawString( "OK?", 100, 50);
      }
   }
     
}