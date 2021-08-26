/**
 * a sub class from shape
 * @author Arman Engin SUCU
 * @version 10.03.2020
 */
public class Rectangle extends Shape implements Selectable{
  
//properties
  private int sides;
  private int width;
  private int height;
  private boolean selection;
  //constructors
  public Rectangle( int width, int height){
    super();
    this.width = width;
    this.height = height;   
  }
  //methods 
  @Override
  double getArea(){ 
    return width*height;
  }
  public boolean getSelected(){
    return selection;
  }
  public void setSelected( boolean s){
    selection = s;
  }
  public Shape contains( int x, int y){
    if(super.getX() - width/2 <= x && super.getX() + width/2 >= x && super.getY() - height/2 <= y && super.getY() + height/2 >= y){
      return this;
    }
    else 
      return null;
  }
   public String toString(){
    return "Rectangle , width: " + width + " height: " + height + " area: " + getArea() + " selection: " + selection;
  }
}