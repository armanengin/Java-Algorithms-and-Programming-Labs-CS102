public class Lab06a{
  public static int counterA(String str){
     int count = 0;
    if(str.length() == 0){
      return 0;
    }   
    if(str.charAt(0) == 'e' || str.charAt(0) == 'E'){
      count++;
    }
   return count + counterA(str.substring(1));
  }
  public static void main(String[] args){
   System.out.println( counterA("Erikleri poşetten çıkar.") );
  }
}
    