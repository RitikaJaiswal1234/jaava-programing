package com.sebone.java.collection;
/**Class Name:- UserData
* Objective:-this class sets and gets the data by user
* @author :-Ritika jaiswal
* Date:-21-03-22
*/
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
}