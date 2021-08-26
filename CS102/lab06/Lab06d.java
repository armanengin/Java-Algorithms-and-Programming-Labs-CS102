public class Lab06d{
  public static boolean checkTheNum(int num){   
    if(num / 10 == 0 ){
      return true;
    }
    if(((num - (num/10)*10) <= ((num/10)*10 - (num / 100)*100)/10)){
      return false;
    }
    num = num / 10;
    return checkTheNum(num);
  }
  
  public static void trickyNums(int digit, int num){   
    //int start;
    //int num;
//    if(digit - 1 == 0){
//      start = 0;
//    }
//    else{
//      start = (int)Math.pow(10 , digit - 1); 
//    }
    //num = start + 2;
    if(checkTheNum(num)){
      System.out.println(num);      
    }
    if(num < Math.pow(10 , digit)){
      trickyNums(digit , num+2);
    }
  }
  public static void main(String[] args){
   trickyNums(4, 1000);
    System.out.println(checkTheNum(124));
  }
}





