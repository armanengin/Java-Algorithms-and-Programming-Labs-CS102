 import cs1.SimpleURLReader;
/**
 * __writing the sub class of Lab02a___ 
 * @author __Arman Engin SUCU___
 * @version __19.02.2020__
 */ 
 public class MySimpleURLReader extends SimpleURLReader{
 //properties
  private final String  URL;
  //constructors
  public MySimpleURLReader ( String theUrl){
  super(theUrl);
  URL = theUrl;
  }
  //Methods
  
  /**
   * @return the url
   */
  public String getURL(){
    return URL;
  }
  
  /**
   * @return the name from the url
   */  
  public String getName(){
    int index=0;
    for(int i =URL.length()-1; 0<=i; i--){
      if(URL.charAt(i) == '/'){
        index = i;
        i = -1;
      }
    }
    return URL.substring(index+1);
  }
  /**
   * overriding the getPageContents() method
   *@return it returns the content without any bugs.
   */
  @Override
  public String getPageContents(){
    String content =super.getPageContents();
    return content.substring(4);
  }
}