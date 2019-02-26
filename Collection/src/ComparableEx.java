import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student>
{
	String s;
	int id;
	public String getS() {
		return s;
	}
	public int getId() {
		return id;
	}
	public void setS(String s) {
		this.s = s;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String s, int id) {
		super();
		this.s = s;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [s=" + s + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return s.compareTo(o.getS());
	}
	
	
}




public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> l1=new LinkedList<>();
		Student st1=new Student("Aavi",155);
		Student st2=new Student("Ravi",12);
		l1.add(st1);
		l1.add(st2);
		Collections.sort(l1);
		System.out.println(l1);
		
		

	}

}
