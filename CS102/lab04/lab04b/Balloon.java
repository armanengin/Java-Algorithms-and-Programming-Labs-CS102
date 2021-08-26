import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
import shapes.*;
public class Balloon extends Circle implements Drawable{
//constants
final int INCREASE = 1; 
final int MAXSIZE = 100;  
//constructor
public Balloon(){   
      super(25);
      setLocation((int)(Math.random() * 800),(int)(Math.random() * 500));
   }
 @Override
  public void draw(Graphics g) {
     //super.paintComponent(g);     
    int radius = this.getRadius();
    g.drawOval(this.getX() - radius, this.getY() - radius, radius * 2, radius * 2);
  }
 public void grow(){
  setRadius(getRadius() + INCREASE);
  if (getRadius() > MAXSIZE){
    setRadius(0);
    setSelected(true);
  }
 }
  
}