public class Lab01b{
  public static void main(String[] args){
    IntBag prime = new IntBag();
    int count = 3;
    int j = 99;
    int a;
    prime.add(2);      
    for(int i = 1; i < 100; i++){  
      for( a = 99; a >= j ; a--){
        while(count % prime.get(a) == 0){
          count++;
          a = 99;
        }
      }
       j--;              
      prime.add(count);
    } 
    prime.add(2,3);
    System.out.println(prime.size());
    System.out.println(prime.contains(5));
     System.out.println(prime.toString()); 
      System.out.println(prime.findAll(3));
    }
  }




