import javax.swing.*;
import java.awt.*;
/**
 * drawing panel
 * @author Arman Engin SUCU
 * @version 01.02.2020
 */

public class MyDrawingPanel extends JPanel{
  //properties
  
  //constructor
  public MyDrawingPanel(){
    setSize( 300 , 250 );
    setBackground(Color.yellow);
  }
  public MyDrawingPanel(int w , int h ){
    setPreferredSize(new Dimension( w , h) );
    setBackground(Color.green);
  }
  public void setColor( Color color ){
    setBackground(color);
  }
}
