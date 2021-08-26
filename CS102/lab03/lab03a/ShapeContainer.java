import java.util.ArrayList;
/**
 * a class to creat and contain sahpes
 * @author Arman Engin SUCU
 * @version 10.03.2020
 */

public class ShapeContainer{
  
  //properties
  private ArrayList<Shape> container;
  
  //constructors
  public ShapeContainer(){
    container = new ArrayList<Shape>();
  }
  
  //methods
  void add (Shape s){
    container.add(s);
  }
  
  double getArea(){
    int sum = 0;
    for(int i = 0; i < container.size(); i++){
      sum += container.get(i).getArea();
    }
    return sum;
  }
  
  public void FirstShape( int x , int y ){
    int control = -1;
    if(container.size() == 0){
      System.out.println("There is no shape in the container, please try again after adding a shape.");
    }
    for(int i = 0 ; i < container.size() ; i++){
      if(((Selectable)container.get(i)).contains(x,y) != null){
        control = i;
      }
      if(control > -1){
       ((Selectable)container.get(i)).setSelected(true);
        System.out.println( container.get(i) );       
      }
      else
        System.out.println("There is no shape that contains this cordinate.");
    }
  }
  public void RemoveSelected(){
    if(container.size() == 0){
      System.out.println("There is no shape in the container, please try again after adding a shape.");
    }
    for(int i = 0 ; i < container.size() ; i++){
      if(((Selectable)container.get(i)).getSelected()){
        container.remove(i);
      } 
    }
  }
  
  public String toString(){
    String areas = "";
    for( int i = 0 ; i < container.size() ; i++ ){
      areas += container.get(i).getArea() + " ,";
    }
    return "The container has size of " + container.size() + "\n and the areas of shapes are: "
      + areas;      
  }
}
