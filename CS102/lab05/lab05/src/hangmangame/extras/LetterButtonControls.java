package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.HangmanModel;

/**
 * LetterButtonControls - keyboard for MVC demo of Hangman, but general purpose.
 *
 * @author David
 * @version 1.00
 */
public class LetterButtonControls extends JPanel {
  HangmanModel hm;
  public LetterButtonControls(HangmanModel hm ){
    this.hm = hm;
  }
  HangmanLetterButtonsController hlbc = new HangmanLetterButtonsController();
  public LetterButtonControls(String letters) {
    this(letters, 13, 2);
    setPreferredSize(new Dimension(200,50));
  }
  
  public LetterButtonControls(String letters, int rows, int cols) {
    
    setBorder(new TitledBorder("Choose a letter..."));
    setLayout(new GridLayout(rows, cols));
    
    
    for (int i = 0; i < letters.length(); i++) {
      JButton b = new JButton("" + letters.charAt(i));
      b.setMargin(new Insets(1, 2, 1, 2));
      b.addActionListener(hlbc);
      add(b);
    }
    
  }
  public class HangmanLetterButtonsController implements ActionListener{  
    //constructor
    
    
    
    public void actionPerformed(ActionEvent e){      
      for( int i = 0 ; i < getComponents().length ; i++){
        if( getComponent(i) == e.getSource() ){
          //hm.tryThis((((JButton)getComponent(i)).getText()).charAt(0));
          ((JButton)getComponent(i)).setEnabled(false);
        }
        
        
//      Component[] buttons = getComponents();
//      for (Component a : buttons) {
//        if(((JButton)buttons[a]) == e.getSource());
//        ((JButton) a).setEnabled(false);
//      }    
        
        
//      Component[] buttons = getComponents();
//      for (Component b : buttons) {
//         ((JButton) b).addActionListener(l);
//      }
//   }
//
//   public void setEnabledAll(boolean state) {
//      for (Component c : getComponents()) {
//         ((JButton) c).setEnabled(state);
//      }
//   }
//
//   public void setDisabled(String letters) {
//      letters = letters.toUpperCase();    // bug fix! ?think about this!
//      for (Component c : getComponents()) {
//         char ch = ((JButton) c).getText().charAt(0);
//         ch = Character.toUpperCase(ch);  // bug fix!
//         if (letters.indexOf(ch) >= 0) {
//            ((JButton) c).setEnabled(false);
//         }
//      }
//   }
      }
    }
  }
}
