import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
public class Lab04b extends JFrame{  
  
  public static void main (String[] args)
  {    
    JFrame frame = new JFrame ( " Lab04b - Balloons game " );  
    BalloonsGamePanel panel = new BalloonsGamePanel();
    frame.add (panel);
    frame.pack();
    
    
    // I got these two line code from internet to locate frame at the center of the screen
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);      
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);  
  }
//     public Lab04b(){
//      BalloonsGamePanel panel = new BalloonsGamePanel();
//      add(panel);
//      setDefaultCloseOperation(EXIT_ON_CLOSE);
//      setBounds( 100 , 100 , 500 , 500);
//    }
//  public static void main(String[] args){
//    Lab04b program = new  Lab04b();
//    program. setVisible(true);
//  }
}