import java.util.ArrayList;
import java.util.List;
class A
{
int id;
String name;
A(int id,String name)
{
this.id=id;
this.name=name;

}
}

public class List1 {
	public static void main(String[] args) throws Exception{
		List<A> l1=new ArrayList<>();
		A a1=new A(1,"ram");
		A a2=new A(6,"B");
		A a3=new A(18,"C");
		A a4=new A(10,"D");
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		l1.add(a4);
		
		l1.add(null);
		l1.add(null);
		for(A s1:l1)
		{
		System.out.println("ID:"+s1.id+" "+"NAME:"+s1.name);
		}
		/*ListIterator<A> li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}*/
		
		
		
		
	}

}