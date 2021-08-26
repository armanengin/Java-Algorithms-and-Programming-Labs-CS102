package hangmangame.extras;

import javax.swing.JPanel;
import javax.swing.JLabel;
import cs102.hangman.IHangmanView;
import cs102.hangman.Hangman;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
/**
 * @Author Arman Engin SUCU
 * @version 14.04.2020
 */

public class LabelsHangmanView extends JPanel implements IHangmanView{
  
//properties
  private JLabel numOfIncorrectTries;
  private JLabel knownSoFar;
  private JLabel usedLetters;
  private JLabel lostOrWin;
  
   
  //constants
  private static final Font font = new Font("Times New Roman", Font.BOLD, 20);
  
  //constructor
  public LabelsHangmanView(){
    setLayout(new GridLayout(4,1,5,5));
    setPreferredSize(new Dimension(400,200));
    numOfIncorrectTries = new JLabel(); 
    knownSoFar = new JLabel(); 
    usedLetters = new JLabel(); 
    lostOrWin = new JLabel(); 
     numOfIncorrectTries.setFont(font);
    knownSoFar.setFont(font);
    usedLetters.setFont(font);
    lostOrWin.setFont(font);
    add( knownSoFar );
    add( usedLetters );
    add( numOfIncorrectTries );  
    add( lostOrWin );
    setBackground(Color.green);
  }
  //implementing IHangmanView
  public void updateView(Hangman hangman){
    if( !hangman.isGameOver()){
      knownSoFar.setText(hangman.getKnownSoFar());
      numOfIncorrectTries.setText("Tries: " + hangman.getNumOfIncorrectTries());
      usedLetters.setText("Used Letters: " + hangman.getUsedLetters());
    }
      else{        
        if(!hangman.hasLost()){
          lostOrWin.setText("Congrulations!!! You Won!!!");
             knownSoFar.setText(hangman.getKnownSoFar());
      numOfIncorrectTries.setText("NumOfWrongTries: " + hangman.getNumOfIncorrectTries());
      usedLetters.setText("Used Letters: " + hangman.getUsedLetters());
        }
        else{
          lostOrWin.setText("Sorry... You Lost");
             knownSoFar.setText("The word was: " + hangman.getKnownSoFar());
      numOfIncorrectTries.setText("Tries: " + hangman.getNumOfIncorrectTries());
      usedLetters.setText("Used Letters: " + hangman.getUsedLetters());
        }
      }
    }
  }
