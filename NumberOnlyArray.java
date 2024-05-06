import java.util.List;
import java.util.ArrayList;

public class NumberOnlyArray {
  
  public static List<Object> filterList(final List<Object> list) { // list (List Object) will be inputted
    List<Object> myOwnList = new ArrayList<>(); //Inputed List Object will be Arrary List
    
    for (Object x : list){ //inputted array list will be iterate to x with enhanced loop
                            // type will be Object than any other because input list is an Object
     if(x instanceof Integer){ //Is it x is Integer?
       myOwnList.add(x); // then add to new array called myOwnList
     }
    }
    return myOwnList;
  }
}
