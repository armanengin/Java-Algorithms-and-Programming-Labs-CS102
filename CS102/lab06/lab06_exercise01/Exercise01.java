import java.util.ArrayList;
public class Exercise01{
  public static String printReverse( ArrayList<String> strings ){
    
    ArrayList<String> strings2 = strings;
    if(strings2.size() == 1){
      return strings2.get(0);
    }
    String last = strings2.get(strings2.size()-1);
    strings2.remove(strings2.size()-1);   
    return last + ", " + printReverse(strings2);    
  }
  
  public static String printForward( ArrayList<String> strings ){
    ArrayList<String> strings2 = strings;
    String first = strings2.get(0);
    if(strings2.size() == 1){
      return strings2.get(0);
    }
    strings2.remove(0);
    return first + ", " + printForward(strings2); 
  }
  
  public static double power( double x, int y){
    double pow;
    if( y == 0 ){
      return 1;
    } 
    else if( y == 1 ){
      return x;
    }
    else if( y == -1){
      return 1/x;
    }     
    if( y < 0){
      pow = 1/x;
      y++;
    }
    else{
      pow = x; 
      y--;
    }
    return pow * power(x , y);
  }
  
  public static int max( int[] x , int n){    
    if(n == 1){
      return Math.max(x[0],x[1]);
    }
    return Math.max( x[n-1], max( x , n-2) );
  }
  
  public static ArrayList<Integer> allInt(int s , int e){
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(s == e){
      list.add(e);
      return list;
    }
    list.add(s);
    
    list.addAll(allInt(s+1,e));
    return list;
  }
  
  
  
  public static void main(String[] srgs){
    ArrayList<String> strings = new ArrayList<String>() ;
    int[] x = {7,2,123,4,0,6,-23,8,500,10};
    strings.add("a");
    strings.add("b");
    strings.add("c");
    strings.add("d");
    strings.add("e");
    System.out.println(printForward(strings));
    System.out.println(printReverse(strings));
    System.out.println(power(3, -1));
    System.out.println(max(x, 5));
    System.out.println(allInt( 5 ,  10));
  }
}
