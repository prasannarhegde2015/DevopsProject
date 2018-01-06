package com.example.numtowrod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class Testnumber {
	NumbertoWord app;
	@Before
	public void setup() {
	   app = new NumbertoWord();
	}

	@Test
	public void numberOnetest() {
		Assert.assertEquals( "Test case : One", "one", app.numbertoword(1) ) ;
	}
	
	@Test
	public void numberfourteen() {
		System.out.println(app.numbertoword(14));
		Assert.assertEquals( "Test case :two", "fourteen", app.numbertoword(14) ) ;
		
	}
	
	@Test
	public void numberfiftyfive() {
		Assert.assertEquals( "Test case :three", "fifty five", app.numbertoword(55) ) ;
	}
	
	@Test
	public void numberonehundrdeight() {
		System.out.println(app.numbertoword(108) );
		Assert.assertEquals( "Test case :four", "one hundred eight", app.numbertoword(108) ) ;
	}
	@Test
	public void numberfivehundredthirteen() {
		
		Assert.assertEquals( "Test case :four", "five hundred thirteen", app.numbertoword(513)) ;
	}

}
