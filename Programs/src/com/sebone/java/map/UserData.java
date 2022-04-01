package com.sebone.java.map;

public class UserData {
	 int rollnumber;
	 String name;
	 int age;
	 //this method sets the rollnumber of the user
	 public void setRollNumber(int rollnumber) {
		 this.rollnumber = rollnumber;
	 }
	 //this method sets the name of the user
	 public void setName(String name) {
		 this.name = name;
	 }
	 //this method sets the age of the user
	 public void setAge(int age) {
		 this.age = age;
	 }
	 //this method return the rollnumber of the user
	 public int getRollNumber() {
	     return this.rollnumber;
	 }
	 //this method return the name of the user
	 public String getName() {
		 return this.name;
	 }
	 //this method return the age of the user
	 public int getAge() {
	     return this.age;
	 }
	 public String toString() {
		 
		return this.getRollNumber()+" " +this.getName()+" "+this.getAge();
		 
	 }
}

