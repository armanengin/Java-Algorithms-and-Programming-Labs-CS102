import cs1.jar;
/**
 * a class to filter HTML
 * @author Arman Engin SUCU
 * @version 23.02.2020
 */
public class HTMLFilteredReader extends MySimpleURLReader{
  //properties
  private String unfilteredContent;
  private String filteredContent;
  
  //constructors 
  public HTMLFilteredReader(String theUrl){
    super(theUrl);
    boolean start = false;
    boolean end = false;
    String filter = "";    
    unfilteredContent = super.getPageContents();
    for(int i = 0; i < unfilteredContent.length(); i++){
      if(unfilteredContent.charAt(i) == '<'){
        start = true;
      }
      if(unfilteredContent.charAt(i) == '>'){
        end = true;
      }
      if(!start && !end){
        filter += unfilteredContent.charAt(i);
      }
      if( start && end){
        start = false;
        end = false;
      }
    }
    filteredContent = filter; 
  }
  
  /**
   * a method to filter out the html code
   * @return the visible text only
   */
  @Override
  public String getPageContents(){
    return filteredContent;
  }
  
  /**
   *@return the original page
   */
  public String  getUnfilteredPageContents(){
    return unfilteredContent;
  }
}