package com.reflaction;
import java.lang.reflect.Method;
 
public class DynamicClassLoading2{
 
	public static void main(String[] args) {
 
	//no paramater
	Class noparams[] = {};
 
	//String parameter
	Class[] paramString = new Class[1];	
	paramString[0] = String.class;
 
	//int parameter
	Class[] paramInt = new Class[1];	
	paramInt[0] = Integer.TYPE;
 
	try{
	        //load the AppTest at runtime
		Class cls = Class.forName("com.and.APIClass");
		Object obj = cls.newInstance();
 
		//call the printIt method
		Method method = cls.getDeclaredMethod("printIt", noparams);
		method.setAccessible(true);
                method.invoke(obj, null);
 
		//call the printItString method, pass a String param 
		method = cls.getDeclaredMethod("printItString", paramString);
		method.setAccessible(true);
                method.invoke(obj, new String("mkyong"));
 
		//call the printItInt method, pass a int param
		method = cls.getDeclaredMethod("printItInt", paramInt);
		method.setAccessible(true);
	        method.invoke(obj, 123);
 
		//call the setCounter method, pass a int param
		method = cls.getDeclaredMethod("setCounter", paramInt);
		method.setAccessible(true);
                method.invoke(obj, 999);
 
		//call the printCounter method
		method = cls.getDeclaredMethod("printCounter", noparams);
		method.setAccessible(true);
                method.invoke(obj, null);
 
	}catch(Exception ex){
		ex.printStackTrace();
	}
   }
}