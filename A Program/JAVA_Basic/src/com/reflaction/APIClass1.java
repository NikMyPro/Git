package com.reflaction;
/**
 * 
 */

/**
 * @ProjectName JAVAReflection
 * @PackageName 
 * @FileName APIClass.java
 * @Author Gateway Technolabs Pvt Ltd.
 * @ModifiedDate Jul 5, 2013 6:24:27 PM
 * @Description 
 */
public class APIClass1 {
    private String demoMethod(String demoParam) {
        System.out.println("Parameter passed: " + demoParam);
        return APIClass1.class.getName();
    } 
}
