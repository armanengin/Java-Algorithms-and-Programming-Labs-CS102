/**
 * a sub class from shape
 * @author Arman Engin SUCU
 * @version 10.03.2020
 */

public class Circle extends Shape implements Selectable{
  //properties
  private int radius;
  private boolean selection = false;
  //constructors
  public Circle (int radius){
    super();
    this.radius = radius;
  }
  //methods
  @Override
  double getArea(){
    return radius*radius*Math.PI;
  }
  public boolean getSelected(){
    return selection;
  }
  public void setSelected( boolean s){
    selection = s;
  }
  public Shape contains( int x, int y){
    if(Math.pow(super.getX() - x,2) + Math.pow(super.getY() - y,2) <= radius ){
      return this;
    }
    else return null;
  }
  public String toString(){
    return "Circle , radius: " + radius + " area: " + getArea() + " selection: " + selection;
  }
}

