package shapes;
/**
 * abstract class implementing circle squer rectangle classes
 * @author Arman Engin SUCU
 * @verison 20.03.2020
 */

public abstract class Shape implements Locatable{
  //properties
  private int x;
  private int y;
  //methods
  double getArea(){
    return 0;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public void setLocation(int x,int y){
    this.x = x;
    this.y = y;
  }
//  abstract void setSelected( boolean x);
//    abstract boolean getSelected();
//    abstract boolean contains( int x, int y);
//    abstract double getArea();

}