package shapes;
import java.util.Scanner;
/**
 * a menu to test ShapeContainer
 * @author Arman Engin SUCU
 * @version 10.03.2020
 */

public class ShapeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    int select;
    Shape shapes;
    ShapeContainer test;
    
    //program code  
    System.out.println("----------------------------------------------------------\n(1).Create an empty set of shapes");
    System.out.println("(2).Enter the shape you want to add.");
    System.out.println("(3).Print out the total surface area of the entire set of shapes");
    System.out.println("(4).Quit.");
    System.out.print("Please choose an option.");
    select = scan.nextInt();    
    if( select == 1 ){
      test = new ShapeContainer();
      do{
        System.out.println("_______________________________________________________________________");
        System.out.println("(1).Create an empty set of shapes");
        System.out.println("(2).Enter the shape you want to add.");
        System.out.println("(3).Print out the total surface area of the entire set of shapes");
        System.out.println("(4).find the first Shape that contains a given x,y point.");
        System.out.println("(5).remove all selected shapes from the set.");
        System.out.println("(6).Quit.");
        System.out.println("_______________________________________________________________________");
        System.out.print("Please choose an option.");
        select = scan.nextInt();
        
        if( select == 2){                 
          System.out.print("\nPlease enter shape features.");
          String shape = scan.next();
          scan.nextLine();
          if( shape.equals("rectangle")){
            System.out.print("\nPlease enter shape width.");
            int width = scan.nextInt();
            System.out.print("\nPlease enter shape height.");
            int height = scan.nextInt();
            shapes = new Rectangle(width,height);
            System.out.print("\nPlease enter the location x.");
            int x = scan.nextInt();
            System.out.print("\nPlease enter the location y.");
            int y = scan.nextInt();
            shapes.setLocation(x,y);
            test.add(shapes);
          }
          if( shape.equals("circle")){
            System.out.print("\nPlease enter shape radius.");
            int radius = scan.nextInt();       
            shapes = new Circle(radius);
            System.out.print("\nPlease enter the location x.");
            int x = scan.nextInt();
            System.out.print("\nPlease enter the location y.");
            int y = scan.nextInt();
            shapes.setLocation(x,y);
            test.add(shapes);
          }
        }
        
        if(select == 3){
          System.out.println( test.getArea() );
        }
        if(select == 4){
          System.out.println("Please enter the x and y that which you want to check whether are they contained.");
          int x = scan.nextInt();
          int y = scan.nextInt();
          test.FirstShape(x , y);
        }
         if(select == 5){
           test.removeSelected();
         }
      }while( select != 6);
    }
  }
}



