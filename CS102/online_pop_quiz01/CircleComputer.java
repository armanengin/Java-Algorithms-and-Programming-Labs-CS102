
/**
 * CircleComputer
 * @author Arman Engin SUCU
 * @version 03.04.2020
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CircleComputer extends JFrame implements ActionListener {
  // poroperties  
  JPanel panel;
  JLabel r;
  JLabel c;
  JTextField radius;
  JTextField circumference;
  
  
//constructor
  public CircleComputer(){
    setTitle("Circle Computer");
    setDefaultCloseOperation( EXIT_ON_CLOSE );
    setLayout( new BorderLayout());
    setBounds( 500 , 200 , 500 , 100 );
    
    panel = new JPanel();
    add( panel , BorderLayout.CENTER );
    panel.setLayout(new GridLayout(2, 2, 3, 3));
    
    r = new JLabel("Radius:");
    c = new JLabel("Circumference:");
    
    radius = new JTextField(10);
    circumference = new JTextField(10);
    panel.add( r );
    panel.add( radius );
    panel.add( c );
    panel.add( circumference ); 
    radius.addActionListener(this);
    circumference.addActionListener(this);
  }
   //Action Performed method  
  @Override
  public void actionPerformed(ActionEvent e){
    int rad = Integer.valueOf(this.radius.getText());    
    circumference.setText(String.valueOf((Math.round(2*Math.PI*rad*100.0)/100.0)));
  }
  
  public static void main(String[] args) { 
    
  CircleComputer program = new CircleComputer();
  program.setVisible(true);
  }
}
  
