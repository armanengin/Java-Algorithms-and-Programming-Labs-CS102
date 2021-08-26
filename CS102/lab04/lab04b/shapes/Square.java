package shapes;
/**
 * a sub class from shape
 * @author Arman Engin SUCU
 * @version 10.03.2020
 */

public class Square extends Rectangle{
//properties
  private int side; 
  //constructors
  public Square(int side){
    super(side,side);
      this.side = side;
  }
  @Override
  public double getArea(){
   return super.getArea();
  }
}