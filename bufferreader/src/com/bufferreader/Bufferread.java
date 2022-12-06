package com.bufferreader;
import java.io.*;
public class Bufferread {

	public static void main(String[] args)throws IOException {
		
		System.out.println("Enter the students data");

	    //scanner object
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

	    //take input age is integer type
	    System.out.println("Enter your age: ");
	    int age = Integer.parseInt(br.readLine());
	    System.out.println("Age- " + age);


	    //take input salary is double type
	    System.out.println("Enter your Id: ");
	    double Id = Float.parseFloat(br.readLine());
	    System.out.println("Enter your  annual fees: ");
	    long l= Long.parseLong(br.readLine());
	    System.out.println("Id- " + Id+"Annual fees"+l);
	    
	  //take input name is string And Char
	    System.out.println("Please enter your name: ");
	    String employee_name = br.readLine();
	    System.out.println("Please enter your initial in single character: ");
	    char name = (char)br.read();   
	    System.out.println("Name- " + employee_name+"."+name);
	}

}
