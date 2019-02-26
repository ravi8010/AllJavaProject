package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.beans.Course;
import com.capgemini.bl.StudentSchedular;


public class View {
	
public static Scanner sc=new Scanner(System.in);
public static StudentSchedular ss=new StudentSchedular();
public static void main(String args[])
{
	
 int n;
 while(true)
 {
	 System.out.println("1:Add \n 2:show \n 3:exit");
	 n=sc.nextInt();
	 switch(n)
	 {
	 case 1: addStudent();
	 break;

	 case 2: showStudent();
	 break;

	 case 3: System.exit(0);
	 break;

	 default: System.out.println("wrong Choice");
	 
	 }
 }

}
private static void showStudent() {
	System.out.println("Enter roll no:");
	int rl=sc.nextInt();
	ss.showAllStudents(rl);
	
}
private static void addStudent() {
	// TODO Auto-generated method stub
	String cname;
	System.out.println("enter roll no.");
	int rl=sc.nextInt();

	System.out.println("enter Name.");
	String sname=sc.next();
	
	   System.out.println("enter no of course");
	   int cno=sc.nextInt();
	   String[] crse=new String[cno];
	   for(int i=0;i<cno;i++)
	   {
		   
		   crse[i]=sc.next();
		  // System.out.println(crse[i]);
	ss.addData(rl,sname,crse);	
}
}}
