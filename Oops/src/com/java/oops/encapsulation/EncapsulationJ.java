package com.java.oops.encapsulation;

class Student {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Student(){
		name="Sweety";
		this.age=23;
	}
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("My name is "+" "+name+" "+"age is "+age);
	}
	
}

public class EncapsulationJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s1 =  new Student();
          s1.setAge(25);
          s1.setName("Sudharshini");          
          System.out.println("My name is "+s1.getName()+" "+"Age is "+s1.getAge());
          
          Student s2 =  new Student("Mrudula",26);
          s2.display();
          
          Student s3 =  new Student();
          s3.display();                          
	}
}
