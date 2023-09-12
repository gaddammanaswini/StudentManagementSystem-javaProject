package com.manaswini.StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy=new Teacher(1,"lizzy",500);
		Teacher melisa=new Teacher(2,"melisa",700);
		Teacher verdonhorn=new Teacher(3,"verdon horn",600);
		
		List<Teacher> teachersList=new ArrayList<>();
		teachersList.add(lizzy);
		teachersList.add(melisa);
		teachersList.add(verdonhorn);
		
		
		Student tamasha =new Student(1,"tamasha",4);
		Student robbi=new Student(2,"Robbi",5);
		Student rakshith=new Student(3,"Rakshith",12);
		
		List<Student> studentsList=new ArrayList<>();
		studentsList.add(rakshith);
		studentsList.add(robbi);
		studentsList.add(tamasha);
		
		
		School ghs=new School(teachersList,studentsList);
		
		tamasha.payFees(5000);
		rakshith.payFees(6000);
		System.out.println("ghs money Earned $"+ghs.getTotalMoneyEarned());
		
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("ghs has paid money to "+lizzy.getName()+" and now has money $"+ghs.getTotalMoneyEarned());
	}

}
