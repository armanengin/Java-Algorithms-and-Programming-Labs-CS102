import java.util.ArrayList;
public class Lab06c{
  public static boolean test( ArrayList<String> strings ){
    ArrayList<String> strings2 = strings;
    if( strings2.size() == 1){
      return true;
    }
    
    if( strings2.get(0).compareTo(strings2.get(1)) > 0 ){
      return false;
    }
    strings2.remove(0);
    return test(strings2);    
  }
  
  public static void main(String[] srgs){
    ArrayList<String> strings = new ArrayList<String>() ;
    strings.add("zero");
    strings.add("father");
    strings.add("grass");
    System.out.println(test(strings));
  }
}

