package hangmangame.extras;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import cs102.hangman.HangmanModel;
import cs102.hangman.IHangmanView;
import cs102.hangman.Hangman;
/**
 * @Author Arman Engin SUCU
 * @version 14.04.2020
 */

public class NewGameButtonControl extends JButton implements ActionListener , IHangmanView{
  private HangmanModel hm;
  //constructor
  public NewGameButtonControl(HangmanModel hm){
    super("New Game");
    this.hm = hm;    
    addActionListener(this);
    setEnabled(false);
  }
  
  public void actionPerformed(ActionEvent e ){
    hm.initNewGame();
    setEnabled(false);
  }
  public void updateView(Hangman hangman){
    if( hangman.isGameOver() ){
      setEnabled(true);
    }
  }
  
}