package com.test.Dumm;

import org.testng.annotations.Test;

public class OkieDokie {
@Test
void test() {
	System.out.println("Hello from Richa");
	WebElement un=driver.findElement(by.id("username"));
	WebElement pw=driver.findElement(by.id("password"));
	WebElement login=driver.findElement(by.id("Login"));
	
}

}
