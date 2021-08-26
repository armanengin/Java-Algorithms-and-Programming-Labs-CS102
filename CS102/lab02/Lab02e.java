import cs1.SimpleURLReader;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * a menu to display the features
 * @author Arman Engin SUCU
 * @version 01.03.2020
 */
public class Lab02e{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    ArrayList<MySimpleURLReader> list = new ArrayList<MySimpleURLReader>();
    int userEntry;
    String getUrl;
    int getIndex;
    //program code
    do{
      System.out.println("___________________________________________________");
      System.out.println("(1) Enter the url of poem to add to collection.");
      System.out.println("(2) List all poems in the collection."); 
      System.out.println("(3) Quit.");
      System.out.println("___________________________________________________");
      userEntry = scan.nextInt();
      getUrl = scan.nextLine();
      if(userEntry == 1){
        System.out.print("Please enter the url.");
        getUrl = scan.nextLine();
        if(getUrl.substring(getUrl.length()-3).equals("txt")){
          list.add(new MySimpleURLReader(getUrl));
        }
        if(getUrl.substring(getUrl.length()-4).equals("html")){
          list.add(new HTMLFilteredReader(getUrl));
        }
        if(getUrl.substring(getUrl.length()-3).equals("htm")){
          list.add(new HTMLFilteredReader(getUrl));
        }
      }
      if(userEntry == 2){
        System.out.print("Indexes of collection and name of the files are: ");
        for(int i = 0 ; i < list.size() ; i++){
          System.out.print( i + "," + list.get(i).getName() + "  " );
        }
       System.out.print("\nEnter the index number of a poem to view it: ");
       getIndex = scan.nextInt();
       if(getIndex >= list.size()){
         System.out.println("\nPlease enter a valid index number.");
       }
       else
         System.out.println("\nThe page content is:\n" + list.get(getIndex).getPageContents());
      }
    } while(userEntry != 3);
  }
}