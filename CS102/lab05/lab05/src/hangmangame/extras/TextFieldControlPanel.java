package hangmangame.extras;
import cs102.hangman.Hangman;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* @Class Discription: This is a controls class for Hangman. It displays an input textfield
 * @Author Arman Engin SUCU
 * @version 14.04.2020
 */
public class TextFieldControlPanel extends JPanel implements ActionListener 
{
  //properties
  private JTextField textField;
  private Hangman hangman;
  
  //contructor
  public TextFieldControlPanel(Hangman hangman)
  {
    super();
    this.hangman = hangman;
    textField = new JTextField(10);//max length of 10
    
    //styling
    textField.setFont(new Font(textField.getFont().getName(), Font.BOLD, 25));
    
    this.add(textField); //adding textField to the panel
    textField.addActionListener(this);//adding controls to the textfield
  }
  
  //implementing ActionListener
  //takes the input in the textField and uses tryThis for all the characters in the input field
  public void actionPerformed(ActionEvent e)
  {
    String str = textField.getText();
    
    //tryThis for all characters
    for (int i = 0; i < str.length(); i++)
    {
      hangman.tryThis(str.charAt(i));
    }
    //changes the textfield to an empty one
    textField.setText("");
  }
  
}//end of class TextFieldControlPanel
//package hangmangame.extras;
//
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import java.awt.event.*;
//import cs102.hangman.Hangman;
//
//public class TextFieldControlPanel extends JPanel{
//  //properties 
//  private Hangman hng;
//  private final JTextField textfield;
//  
//  //constructor
//  public TextFieldControlPanel( Hangman hng ){
//    this.hng = hng;
//    textfield = new JTextField();
//    add(textfield);
//    
//    textfield.addActionListener(new ActionListener(){
//      public void actionPerformed(ActionEvent e ){
//        String str = textfield.getText();
//        for(int i = 0 ; i < str.length() ; i++){
//          hng.tryThis(str.charAt(i));
//        }
//        textfield.setText("");
//      }
//    });
//  }
//}