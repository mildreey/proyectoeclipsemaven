package com.jarroba.ejemplo.nombreDeMiProyecto;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    System.out.println("Bienvenido a las pruebas de Maven, Jenkins y Junit");
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    App c = new App();
		int sumar1,num1=3,num2=3;
		sumar1=num1+num2;
		System.out.println("Mi suma ");
		System.out.println("resultado= "+sumar1);
  
        assertTrue( true );
    }
}
