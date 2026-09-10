package programming_essentials;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import collectionframework2.Department;

public class ReflectionExampleMain {
	private static void printStringClassInfo() {
		Class<String> stringClass = String.class; // to get info of String class
		String clsName = stringClass.getName();
		System.out.println("Class Name: " + clsName);
		
		//Printing Methods of String class
		
		System.out.println("Printing Method Name.....");
		Method[] allMethods =  stringClass.getDeclaredMethods();
		for(Method currentMethod : allMethods) {
			String methodName = currentMethod.getName();
			System.out.println(methodName);
		}
		   
		//Printing Field Names
		
		System.out.println("Printing Field Name.....");
		Field[] allField =  stringClass.getDeclaredFields();
		for(Field currentField : allField) {
			String fieldName = currentField.getName();
			System.out.println(fieldName);
		}
	}
	
	private static void printDepartmentClassInfo() {
		Class<Department> deptCls = Department.class;
		String clsName = deptCls.getName();
		
		
		System.out.println("Class Name: " + clsName);
		System.out.println("Printing Method Name.....");
		Method[] allMethods =  deptCls.getDeclaredMethods();
		for(Method currentMethod : allMethods) {
			String methodName = currentMethod.getName();
			System.out.println(methodName);
		}
		
		
		System.out.println("Printing Field Name.....");
		Field[] allField =  deptCls.getDeclaredFields();
		for(Field currentField : allField) {
			String fieldName = currentField.getName();
			System.out.println(fieldName);
		}
	}
	
	private static void printAnyClassInfo(Object obj) {
		Class currentClass = obj.getClass();
		System.out.println(currentClass.getName());
	}
	
	public static void main(String[] args) {
		printStringClassInfo();
		System.out.println("--------------------------------");
		printDepartmentClassInfo();
		System.out.println("--------------------------------");
		printAnyClassInfo(25.5);
	}
}
