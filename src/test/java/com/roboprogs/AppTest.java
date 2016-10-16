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
    private static final String LOG_STR_CONTENT =
            "(foo=I am foo!, bar=42, quack=true)";

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
        beanieAssertionFixture( "ShortBean" + LOG_STR_CONTENT, bean );
    }

    /** try out the even better bean that Lombok generated */
    public void testShorterBean() {
        ShorterBean bean;

        bean = new ShorterBean( "change me", BAR, true );
        bean.setFoo( FOO );
        beanieAssertionFixture( "ShorterBean" + LOG_STR_CONTENT, bean );
    }

    /** try out the immutable value bean that Lombok generated */
    public void testConstBean() {
        ConstBean bean;

        bean = new ConstBean( FOO, BAR, true );
        // bean.setFoo( FOO ); - not defined!
        beanieAssertionFixture( "ConstBean" + LOG_STR_CONTENT, bean );
    }

    /** verify that the given bean implementation has expected content */
    private void beanieAssertionFixture(
        String logStr,
        Beanie bean
    ) {
        assertEquals( FOO, bean.getFoo() );
        assertEquals( BAR, bean.getBar() );
        assertTrue( bean.isQuack() );
        assertEquals( logStr, bean.toString() );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
