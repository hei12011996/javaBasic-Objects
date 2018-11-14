package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        // throw new NotImplementedException();
        StackTraceElement parentElement = Thread.currentThread().getStackTrace()[2];
        return parentElement.getClassName() + "." + parentElement.getMethodName();
        // --end-->
    }
}
