package CS102.MyLabs.lab07.ds;
public class Test{ 
  public static void main(String[] args){
    List list = new List();
    List a = new List();
    List b = new List();
    a.addToHead("A");
    a.addToHead("D");
    a.addToHead("C");
    
    b.addToHead("K");
    b.addToHead("B");
    b.addToHead("A");
    b.addToHead("C");
    b.addToHead("R");
    list = List.merger(a,b);
    System.out.println(list);
  }   
}