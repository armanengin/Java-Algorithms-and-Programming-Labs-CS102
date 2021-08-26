 import cs1.SimpleURLReader;
/**
 * __a class to to test cs1.jar___ 
 * @author __Arman Engin SUCU___
 * @version __19.02.2020__
 */ 
 public class Lab02a{
  public static void main(String[] args){
   SimpleURLReader scan = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.html");
  System.out.println("The page content is: " + scan.getPageContents());
   System.out.println("The line count is: " + scan.getLineCount());
  }
}