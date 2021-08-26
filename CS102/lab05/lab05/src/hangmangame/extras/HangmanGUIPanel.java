package hangmangame.extras;

import cs102.hangman.HangmanModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Collection of UI components to form a complete Hangman game. 
 * View components implement IHangmanView, so they can automatically update
 * whenever the hangmanModel associated with changes, changes.
 * Other components are hangman controllers that update the model.
 * @Author Arman Engin SUCU
 * @version 14.04.2020
 */
public class HangmanGUIPanel extends JPanel {
  
  private HangmanModel hm;
  private TextFieldControlPanel tfcp;
  private NewGameButtonControl ngbc;
  private LabelsHangmanView lhv;
  private GallowsHangmanView ghv;
  private LetterButtonControls lbc;
  
  public HangmanGUIPanel( HangmanModel hm) {     
    this.hm = hm;
    lhv = new LabelsHangmanView();
    ghv = new GallowsHangmanView(hm);
    ngbc = new NewGameButtonControl(hm);
    hm.addView(lhv);
    hm.addView(ghv);
    hm.addView(ngbc);
    tfcp = new TextFieldControlPanel(hm);
    lbc = new LetterButtonControls(hm.getAllLetters());
    
    
    setPreferredSize( new Dimension( 1000, 800) );
    setLayout( new BorderLayout() );
    add(tfcp , BorderLayout.NORTH);
    add(ngbc , BorderLayout.SOUTH);
    add(lhv , BorderLayout.WEST); 
    add(ghv , BorderLayout.CENTER);
    add(lbc , BorderLayout.EAST);
    setBackground(Color.YELLOW);
    
    // add controls and views here...
    
  }
  
}
