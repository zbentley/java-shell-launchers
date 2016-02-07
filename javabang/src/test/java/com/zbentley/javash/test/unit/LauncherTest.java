package com.zbentley.javash.test.unit;

import com.zbentley.javash.Launcher;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LauncherTest
    extends TestCase
{
    public LauncherTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LauncherTest.class );
    }

    public void testLauncher()
    {
        assertEquals("test: foo", Launcher.testHook("foo"));
        //assertTrue(false);
    }
}
