import cs1.SimpleURLReader;
import java.util.ArrayList;
/**
 * @author Arman Engin SUCU
 * @version 23.02.2020
 */
public class XHTMLFilteredReader extends HTMLFilteredReader{
//constants
  final int NUM = 6; 
  
//constructors  
  public XHTMLFilteredReader( String theUrl ){
    super(theUrl);
  }
  
  //methods  
  /**
   * calculates contentsWithHTML to contentsWithoutHTML ratio regarding their length
   * @return unfilteredContent/filteredContent
   */  
  public double theRatio(){
    return super.getUnfilteredPageContents().length()/super.getPageContents().length();
  }
  
  /**
   * a method to get links from the url
   * @return ArrayList having the values of links
   */
  public ArrayList<String> getLinks(){
    
    ArrayList <String> links = new ArrayList();
   
    String noFilter = super.getUnfilteredPageContents();   
    // giving start a initial value
    int start = 1000;
    
    while(start > 5){
      start = noFilter.indexOf("href=\"")+NUM;
      noFilter = noFilter.substring(start);
      int end = noFilter.indexOf("\"");
      links.add(noFilter.substring(0,end));      
    }
    return links;
  }
}









