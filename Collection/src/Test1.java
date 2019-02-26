import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] myObjects = {
				new Integer(4),new Integer(3), new String("foo")
				
				 
				
				 };
				 Arrays.sort(myObjects);
				 for( int i=0; i<myObjects.length; i++) {
				 System.out.print(myObjects[i].toString());
				System.out.print(" ");
				 }

	}

}
*/


//2.
class Test1
{
public static Iterator reverse(List list) {
 Collections.reverse(list);
 return list.iterator();
 }
 public static void main(String[] args) {
 List list = new ArrayList();
list.add(" 1"); 
list.add("2"); 
list.add("3");

 System.out.print(list);

 }}


