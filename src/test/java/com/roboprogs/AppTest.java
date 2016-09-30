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

    /** sample "foo" value */
    private static final String FOO = "I am foo!";

    /** sample "bar" value */
    private static final int BAR = 42;

    /** test value for "toString()" with typical bean configuration */
    private static final String LOG_STR =
            "ShortBean(foo=I am foo!, bar=42, quack=true)";

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
        ShortBean bean;

        bean = new ShortBean();
        bean.setFoo( FOO );
        bean.setBar( BAR );
        bean.setQuack( true );
        beanieAssertionFixture( bean );
    }

    /** verify that the given bean implementation has expected content */
    private void beanieAssertionFixture( Beanie bean ) {
        assertEquals( FOO, bean.getFoo() );
        assertEquals( BAR, bean.getBar() );
        assertTrue( bean.isQuack() );
        assertEquals( LOG_STR, bean.toString() );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
