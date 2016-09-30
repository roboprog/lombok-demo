package com.roboprogs;

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
        return new TestSuite( AppTest.class );
    }

    /** try out the bean that Lombok generated */
    public void testShortBean() {
        final String FOO = "I am foo!";
        final int BAR = 42;
        ShortBean bean;

        bean = new ShortBean();
        bean.setFoo( FOO );
        bean.setBar( BAR );
        bean.setQuack( true );
        assertEquals( FOO, bean.getFoo() );
        assertEquals( BAR, bean.getBar() );
        assertTrue( bean.isQuack() );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
