public class Lab06b{
  public static int toBinary(int dec){
    if(dec == 0){
      return 0;
    }         
   return (dec % 2) + 10*toBinary(dec/2);
  }
  public static void main(String[] args){
   System.out.println( toBinary(10) );
  }
}
    