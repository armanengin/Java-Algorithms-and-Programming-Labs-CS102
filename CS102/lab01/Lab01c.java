import java.util.Scanner;
public class Lab01c{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //Variables 
    int userEntry ;
    int testEntry = 0; // for option 6 && 7 && 8
    IntBag intbag = new IntBag();
    String setOfLoc = "";
    //Codes 
    do{
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" 1. Create a new empty collection with a specified maximum capacity (any previous values are lost!)");
      System.out.println(" 2. Read a set of positive values into the collection (use a negative value to indicate all the values have been entered.)");
      System.out.println(" 3.Print the collection of values.");
      System.out.println(" 4.Add a value to the collection of values at a specified location");
      System.out.println(" 5.Remove the value at a specified location from the collection of values");
      System.out.println(" 6.Read a single test value.");
      System.out.println(" 7.Compute the set of locations of the test value within the collection* (see note below).");
      System.out.println(" 8.Print the set of locations.");
      System.out.println(" 9.Quit the program.");
      System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
      System.out.println("Please enter the number to reach the specific feature from the menu.");
      userEntry = scan.nextInt();
      // menu 1
      if(userEntry == 1){
        System.out.println("Please enter the maximum number that you want.");
        int num = scan.nextInt();
        intbag = new IntBag(num);
      }
      //menu 2
      if( userEntry == 2){
        System.out.println("Please enter the numbers to the collection.");      
        
        for(int i = 0; i < intbag.size(); i++){
          int value = scan.nextInt();
          if (value >=0){
            intbag.add(value);
          }
          else
            i = intbag.size();
        }
      }
      //menu 3
      if( userEntry == 3){
        System.out.println(intbag);
      }
      
      //menu 4
      if( userEntry == 4){
        System.out.println("Please enter the number.");
        int num = scan.nextInt();
        System.out.println("Please enter the location.");
        int loc = scan.nextInt();
        intbag.add(num,loc);
      }
      //menu 5
      if(userEntry == 5){
        System.out.println("Please enter the location of number that you want to remove.");
        int loc = scan.nextInt();
        intbag.remove(loc);
      }
      //menu 6
      if(userEntry == 6){
        System.out.println("Please enter a test value");
        testEntry = scan.nextInt();
      }
      //menu 7
      if(userEntry == 7){
       int length = intbag.findAll(testEntry).length;
       int[] locations = new int[length];
        for(int i = 0; i < length -1; i++){
          locations[i] = intbag.findAll(testEntry)[i];
        }
        setOfLoc += locations;
      }
       if(userEntry == 8){
         System.out.println(setOfLoc);
       }
      
    }while(userEntry != 9);
    
  }    
}
