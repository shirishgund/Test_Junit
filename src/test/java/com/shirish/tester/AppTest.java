package com.shirish.tester;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	App1 as=new App1();
    @Test
    public void Addition()
    {	
        
        assertEquals(4,as.adder(2, 2) );
    }
    @Test
    public void Subtraction()
    {
        assertEquals(0,as.sub(2, 2) );
    }
}
