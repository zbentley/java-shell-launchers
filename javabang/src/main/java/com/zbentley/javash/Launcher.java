package com.zbentley.javash;

import org.patrodyne.scripting.java.Execute;
import org.patrodyne.scripting.java.JavaCodeScriptEngine;
public class Launcher extends org.patrodyne.scripting.java.Execute
{
    static {
        System.setProperty(org.patrodyne.scripting.java.JavaCodeScriptEngine.SYSPROP_PREFIX + org.patrodyne.scripting.java.JavaCodeScriptEngine.SOURCEPATH, ".");
        System.setProperty(org.patrodyne.scripting.java.JavaCodeScriptEngine.SYSPROP_PREFIX + org.patrodyne.scripting.java.JavaCodeScriptEngine.CLASSPATH, ".");
    }

    public static String testHook(String s) {
        return "test: " + s;
    }
}
