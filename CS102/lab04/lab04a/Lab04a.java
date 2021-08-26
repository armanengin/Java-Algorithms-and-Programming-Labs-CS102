/**
 * author@ Arman Engin SUCU
 * version@ 30.03.2020
 */
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
public class Lab04a extends JFrame implements ActionListener {
  //properties
  final int ROW = 5;
  final int COLUMN = 10;
  JButton b;
  JButton prize;
  JPanel panel;
  JLabel label;
  int control;
  int count;
  
  //constructor
  public Lab04a(){
    count = 0;
    setTitle( "PotLuck" );
    setLocationRelativeTo(null);
    setDefaultCloseOperation( EXIT_ON_CLOSE );     
    setLayout( new BorderLayout());
    setBounds( 500 , 200 , 500 , 500 );
    
    panel = new JPanel();
    add( panel , BorderLayout.CENTER );
    panel.setLayout(new GridLayout(ROW, COLUMN, ROW*2, COLUMN*2));
    panel.setBorder(new EmptyBorder( ROW , ROW , COLUMN , COLUMN ));
    
    control = (int)((Math.random())*ROW*COLUMN);
    
    for( int i = 0 ; i < (ROW*COLUMN) ; i++ ){
      if( control == i){
        prize = new JButton("Button" + (i +1));
        prize.addActionListener(this);
        panel.add(prize);
      }
      else 
        b = new JButton("Button " + (i + 1));
      b.addActionListener(this);
      panel.add(b);
    }
    
    label = new JLabel("You clicked " + count + " times.");     
    add(label , BorderLayout.NORTH);
    label.setHorizontalAlignment(SwingConstants.CENTER);     
  }
  //Action Performed method  
  @Override
  public void actionPerformed(ActionEvent e){
    
    if( e.getSource() == prize ){
      label.setText( "You win the game in " + ( count + 1 ) + " tries." ); 
      for( int i = 0 ; i < ROW*COLUMN ; i++){
        if( panel.getComponent(i) != e.getSource() ){
          ((JButton)panel.getComponent(i)).setEnabled(false);
        }
      }
    }
    
    else
      count++;
    label.setText( "You clicked " + count + " times." );
    ((JButton) e.getSource()).setEnabled(false);
  }
  public static void main(String[] args) {              
    Lab04a potluck = new Lab04a();
    potluck.setVisible(true);
    potluck.pack();
  }
}



