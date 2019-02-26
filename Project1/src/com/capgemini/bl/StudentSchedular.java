package com.capgemini.bl;

import com.capgemini.beans.Student;

public class StudentSchedular {
	private Student[] st=new Student[10];
	private int counter,i;
	/*public void showData(int rl) {
		// TODO Auto-generated method stub
	   for(i=0;i<counter;i++)
	   {
		   if(st[i].getRl()==rl)
		   {
			   System.out.println("Student name is"+st[i].getName()+"\n"+"Roll no is:"+st[i].getRl());
			   
		   }
		   
		  
		   else
		   {
			   System.out.println("ROLL NO. IS NOT MATCHED");
		   }
			   
	   }
	}
	*/
	public void addData(int r1, String sname,String[] courses) {
		// TODO Auto-generated method stub
		st[counter]=new Student();
		st[counter].setName(sname);
		st[counter].setRl(r1);
		st[counter].setEnroll(courses);	
		counter++;
		
		
		
	}
	
	public void showAllStudents(int rl)
	{
		
		if(st[i].getRl()==rl)
		{
		for(int i=0;i<counter;i++)
		{
			System.out.println("Roll no is:"+st[i].getRl());
			System.out.println("Name is:"+st[i].getName());
			
			for(int j=0;j<st[i].getEnroll().length;j++)
			{
				System.out.println(st[i].getEnroll()[j]);
			}
		}
		}
	}
	
	

}
