import javax.swing.*;
import java.awt.*;
/**
 *  
 * @author Arman Engin SUCU
 * @version 01.02.2020
 */ 
public class MyFrame extends JFrame
{
  // properties
  
  // constructors
  public MyFrame()
  {
    JButton b;
    JPanel p;
    JPanel k;
    // f.setSize( 400, 300);
    // setBounds( 350, 250, 400, 300);
    setLayout( new FlowLayout() );
    
    p = new MyPanel();
    //add( new MyPanel() );
    //add( new MyPanel() );
    k = new MyDrawingPanel(200,200);
    //k.setColor(Color.green);
//   add( new MyDrawingPanel() );
//    add( new MyDrawingPanel() );
    
//      p.add( new Label( "Welcome to ZOOM") );
//      
//      b = new Button( "OK");
//      p.add( b);
//      p.add( new Button( "Good luck with Maths! ") );
//      
//      p.add( new TextField( 25) );
    
    add( p);
    add( k );
    pack();
    setVisible( true );      
  }
  
  // methods
  
}