
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
 String name;
 int id;
 

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
}
public String getName() {
	return name;
}
public int getId() {
	return id;
}
public void setName(String name) {
	this.name = name;
}
public void setId(int id) {
	this.id = id;
}
public Student1(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
}
class Sortbyroll implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
}
class Sortbyname implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}


public class ComparatorEx {

	public static void main(String[] args) {

    ArrayList<Student1> al=new ArrayList<>();
		//List<Student1> al=new ArrayList<>();
    al.add(new Student1("asasi",12));
    al.add(new Student1("sausi",15));
    al.add(new Student1("mdkh",15));
    al.add(new Student1("hasd",15));
    for (int i=0; i<al.size(); i++) 
    {     System.out.println(al.get(i));} 
    //Collections.sort(al,new Sortbyname());
    Collections.sort(al,new Sortbyname());
    System.out.println("Sort by name");
    System.out.println(al);
   
    
    

    
    
    
    

	}

}
