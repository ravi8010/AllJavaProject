import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
			
		al.add(6);
		al.add(68);
		al.add(23);
		al.add(55);
		al.add(66);
	
		Set<Integer> s1=new HashSet<Integer>(al);
		/*s1.add("ram");
		s1.add("Abc");
		s1.add("xyz");
		s1.add("xyz");
		s1.add("abc");
		s1.add("har");
		*/
		//s1.add(null);
		ArrayList<Integer> al2=new ArrayList<>();
			
		
		al2.add(25);
		al2.add(6);
		al2.add(23);
		al2.add(35);
		al2.add(23);
		al2.add(86);
		al2.add(20);
		
		s1.remove(68);
		int s=s1.size();
		
		Set<Integer> s2=new HashSet<Integer>(al);
	        
	        System.out.println(s1);
	        System.out.println(s);
	        
		
		
		
		/*
		Iterator<Integer> i=s2.iterator();
		while(i.hasNext())
			
		{
		System.out.println(i.next());
		}*/
		
    /*    System.out.println("sorted element using treeset");
        Set<Integer> s2=new TreeSet<Integer>(s1);
        System.out.println(s2);//null is not allowed in tree set
	}*/

	}}

