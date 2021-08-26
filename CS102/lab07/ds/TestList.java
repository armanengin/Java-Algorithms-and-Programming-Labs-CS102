package CS102.MyLabs.lab07.ds;
import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class TestList extends TestCase {
  List list = new List();
  List a = new List();
  List b = new List();
//  a.addToHead("a");
//  a.addToHead("b");
//  a.addToHead("c");
//  a.addToHead("d");
//  
//  b.addToHead("c");
//  b.addToHead("d");
//  b.addToHead("e");
//  b.addToHead("f");
//  
//  //creating expected list 
//  list.addToHead("a");
//  list.addToHead("b");
//  list.addToHead("e");
//  list.addToHead("f");
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testMerger() {
    a.addToHead("a");
    a.addToHead("b");
    a.addToHead("c");
    a.addToHead("d");
    
    b.addToHead("c");
    b.addToHead("d");
    b.addToHead("e");
    b.addToHead("f");
    
    //creating expected list 
    list.addToHead("a");
    list.addToHead("b");
    list.addToHead("e");
    list.addToHead("f");
    
    int actual = 0;
    int expected = 4;
    for( int i = 0 ; list.getData(i) != null ; i++){
      List.merger(a , b).contains(list.getData(i));
      actual++;
    }
    assertEquals(expected , actual);
  }
  
  public void testCreateFrom(){
    String[] array = { "a" ,"b" , "c" , "d"};
    a.addToHead("d");
    a.addToHead("c");
    a.addToHead("b");
    a.addToHead("a");
    List list = List.createFrom(array);
    assertEquals(true , a.toString().equals(list.toString()));
  }
  
  public void testAddToTail(){
    
    a.addToHead("c");
    a.addToHead("b");
    a.addToHead("a");
    a.addToTail("d");  
    
    list.addToHead("d");
    list.addToHead("c");
    list.addToHead("b");
    list.addToHead("a");
    assertEquals(true , a.toString().equals(list.toString()));
  }
  
  public void testIsEmpty(){
    assertEquals(true , list.isEmpty());
  }
  
   public void testAddToHead(){
    
    a.addToHead("c");
    a.addToHead("b");
    a.addToHead("a");
    a.addToTail("d");  
    
    list.addToHead("d");
    list.addToHead("c");
    list.addToHead("b");
    list.addToHead("a");
    assertEquals(true , a.toString().equals(list.toString()));
  }
}
