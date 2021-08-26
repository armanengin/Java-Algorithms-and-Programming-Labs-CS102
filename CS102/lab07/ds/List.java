package CS102.MyLabs.lab07.ds;

/** A simple linkedList
  *@author Arman Engin SUCU
  *@version 11.05.2020
  */
public class List{
  
  //properties
  private Node firstNode;
  
  //inner class 
  private class Node{
    public String str;
    public Node next;
    public Node(String str , Node next){
      this.str = str;
      this.next = next;
    }
  }
  
  //constructor 
  public List(){
    firstNode = new Node(null,null);
  }
  
  //private helper methods
  private Node previous( Node n){
    Node prev = null;
    Node temp = firstNode;
    while( n != temp){
      prev = temp;
      temp = temp.next;
    }
    return prev;
  }
  
  //returns a reference to the last Node in the list.
  private Node tail(){
    Node current = firstNode;
    while( current != null ){
      current = current.next;
    }
    return current;
  }
  //methods
  public void addToHead( String item){
    Node newNode = new Node(item , null);
    newNode.next = firstNode;
    firstNode = newNode;
  }
  
  public void addToTail( String item){
    Node newNode = new Node(item , null);
    Node temp = firstNode;
    if(temp.next == null){
      firstNode = newNode;
    }
    else{
    while( temp != null){
      temp = temp.next;
    }
    previous(temp).next = newNode;
    temp = newNode;
    }
  }
  
  public String removeFromHead(){
    Node temp = firstNode;
    firstNode = firstNode.next;
    return temp.str;
  }
  
  public boolean isEmpty(){
    return (firstNode == null);
  }
  
  public String getData( int index){
    Node temp = firstNode;
    for( int i = 0 ; i < index ; i++){
      if(temp == null){
        return null;
      }
      else{
        temp = temp.next;
      }
    }
    return temp.str;
  } 
  
  
  //prints the toString
  public void print(){
    System.out.println(toString());
  }
  
  // recursive method
  public void printReverse(){
    String result = "{ ";
    Node temp = tail();
    while(previous(temp) != firstNode){
      result += previous(temp).str + ", ";
      temp = previous(temp);
    }
    System.out.println( result + "}" ); 
  }
  
  
  public String toString(){ 
    String result = "{ ";
    Node current = firstNode;
    while( current != null ){
      result += current.str + ",";
      current = current.next;
    }
    return result + " }";
  }
  
  
// true if target is in the list, else false  
  public boolean contains( String target){
    Node current = firstNode;
    while( current != null ){
      if(target.equals(current.str)){
        return true;
      }
      current = current.next;
    }
    return false;
  }
  
  // true if values strictly ascending, else false
  public boolean isOrdered(){
    Node current = firstNode;
    while( current != null ){
      if(current.str.compareTo(current.next.str) > 0 ){
        return false;
      }
      current = current.next;
    }
    return true;
  }
  
  /**
   * creates a list from string array.
   * @param String[] array
   * @return list
   */
  public static List createFrom( String[] arrays ){
    List list = new List();
    for(int i = 0 ; i < arrays.length ; i ++){
      list.addToTail(arrays[i]);
    }
    return list;
  }
  
  /**
   * makes new list from two lists uncommon properties.
   * @param String[] array
   * @return new list
   */ 
  public static List merger( List a, List b){
    List list = new List();
    for(int i = 0 ; a.getData(i) != null ; i++){
      if(!b.contains(a.getData(i))){
        list.addToTail(a.getData(i));    
      }
    }
    
    for(int i = 0 ; b.getData(i) != null ; i++){
      if(!a.contains(b.getData(i))){
        list.addToHead(b.getData(i));    
      }
    }
    return list;
  }
}
