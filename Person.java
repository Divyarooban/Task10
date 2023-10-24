package task10;

import java.util.Scanner;

public class Person {
	
	int age;
	String name;

	public Person() {
		
		System.out.println("Enter the name and age");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		this.age=a;
		this.name=b;
	}
	
	public String getname() {
		
		return name;
	}
	
	public int getage() {
		
		return age;
	
	}
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Name: "+p.getname());
		System.out.println("Age: "+p.getage());

	}

}
