package com.authentiq;


public class Person{
	
	private String name;
	private int age;
	private int height;
	private int weight;
	private String eyeColour;
	private String gender;
	
	// CONSTRUCTOR METHODS
    /*
    NAME MUST BE THAT OF THE CLASS
    ARE OPTIONAL
    MUST HAVE ACCESS SPECIFIER
    ATTRIBUTES ARE OPTIONAL
    */
	
	public Person(){
		//Without arguments or parameters
	}
	
	//with arguments:
	
	public Person( String name, int age, int height, int weight, String eyeColour, String gender){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColour = eyeColour;
		this.gender = gender;
		
	}
	 /*
    method created with arguments in the format argumentType argumentName
	name,age,height,etc are variables for the class and are now used as a constructor parameter as well.
    That's why the keyword 'this' is used. 
    To help the compiler tell which you were referring to. In this case, the constructor  parameter, not the variable
    */
	
	
	// OTHER METHODS:
    /*
    CAN HAVE ANY NAME (AVOID ANYTHING OTHER THAN ALPHABETS)
    HAVE AN OPTIONAL RETURN TYPE
   
    */
	
	public String getName(){
		return name;
	}
	public void setName(String value){
		name = value;
	}
	public int getAge(){
		return + age;
	}
	public void setAge(int value){
		age = value;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int value){
		height = value;
	}
	public int getWeight(){
		return weight;
	}
	public void setWeight(int value){
		weight = value;
	}
	public String getEyeColour(){
		return eyeColour;
	}
	public void setEyeColour(String value){
		eyeColour = value;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String value){
	gender = value;
	}
	
	
		
	

}	