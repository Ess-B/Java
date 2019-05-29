package com.authentiq;

import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PersonTest{
	
	@Test
	public void testPerson(){
		Person p = new Person ("Essie", 23, 170, 68, "Brown", "FEMALE");
		Logger l = Logger.getLogger( Person.class.getName());
		l.info ( " Name: " + p.getName());
		l.info ("Age:" + p.getAge());
		l.info ("Height (cm): " + p.getHeight());
		l.info ("Weight (kg): " + p.getWeight());
		l.info ("Eye Colour: " + p.getEyeColour());
		l.info ("Gender: " + p.getGender());
		assertEquals ( "Essie" , p.getName());
		assertEquals (23, p.getAge());
		assertEquals (170, p.getHeight());
		assertEquals (68, p.getWeight());
		assertEquals ("Brown", p.getEyecolour());
		assertEquals ("FEMALE", p.getGender());
		
		
	}
	
}