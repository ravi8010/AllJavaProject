
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"ran");
		hm.put(2,"raqn");

		hm.put(3,"Shri");
		hm.put(4,"Imran");
         System.out.println(hm);
         Set<Integer> s=hm.keySet();
        
         Iterator<Integer> it=s.iterator();
        		  while(it.hasNext())
        		  {
        			  Integer key=it.next();
        			  System.out.println("key "+key);
        			  System.out.println("value "+hm.get(key));
        			  
       	  }
	



Set<Entry<Integer,String>> s2=hm.entrySet();
Iterator<Entry<Integer,String>> it2=s2.iterator();
while(it2.hasNext())
{
	Entry<Integer,String> en=it2.next();
	System.out.println(en.getKey());
	System.out.println(en.getValue());
}
	}
}

//enteryset()//return key and value
//entry is a INterface under Map Interface