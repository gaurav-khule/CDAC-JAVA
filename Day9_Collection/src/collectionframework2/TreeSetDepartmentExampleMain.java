package collectionframework2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDepartmentExampleMain {
	public static void main(String[] args) {
		Comparator<Department> headCountAscComp = new DepartmentHeadCountAscComparator();
		Comparator<Department> headCountDescComp = new DepartmentHeadCountDescComparator();
		
		
		SortedSet<Department> allDepartments = new TreeSet<>(headCountDescComp);
		Department d1 = new Department(1,"Accounts",5);
		Department d2 = new Department(2,"Infromation Technology",50);
		Department d3 = new Department(3,"Transport",7);
		Department d4 = new Department(4,"Admin",8);
		Department d5 = new Department(5,"Human Resources",12);
		
		allDepartments.add(d1);
		allDepartments.add(d2);
		allDepartments.add(d3);
		allDepartments.add(d4);
		allDepartments.add(d5);
		
		for(Department curreDepartment : allDepartments) {
			System.out.println(curreDepartment);
		}	
	}
}
