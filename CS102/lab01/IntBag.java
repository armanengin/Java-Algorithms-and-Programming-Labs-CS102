public class IntBag{
  //properties
  private int[] bag;
  private int valid = 0;  
  //constructors
  public IntBag(){   
    this.bag = new int[100];
  }
  public IntBag(int arraySize){   
    this.bag = new int[arraySize];
  }
  //Methods
  public void add(int i){       
    if(bag.length > valid){
    bag[valid] = i;
    valid++;
    }
  }
  public void add(int a, int bagLoc){    
    for(int i = bag.length-2; i >=bagLoc; i--){
    bag[i+1] = bag[i];
  }
    bag[bagLoc] = a;
  }
  public void remove(int bagLoc){       
    if(bagLoc == 99){
      bag[99]= 0;
    }
    for(int i = bagLoc ; i < bag.length-1; i++){
      bag[bagLoc] = bag[bagLoc+1]; 
      bagLoc++;
    }        
  }
  public boolean contains(int j){
    int check = 0;
    for( int i = 0 ; i < 100 ; i++){
      if(bag[i] == j){        
        check++;
      }
    }
    return check > 0;
  }
  public String toString(){
    String str = "[";
    for(int i = 0; i < bag.length - 1; i++){
    str +=  bag[i]+ ",";
    }
      return  str + bag[bag.length-1] +"]";
  }
  
  public int size(){
    return valid;
  }
  public int get(int i){
    return bag[i];
  }
  public int[] findAll(int a){
   int [] indexes = new int[valid];
   int loc = 0;
   for(int i = 0; i < indexes.length; i++){
     if( bag[i] == a){       
       indexes[loc]= i;
       loc++;
       }
     }
  return indexes; 
  }
   
  }









