package collectionframework2;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExampleMain {
	public static void main(String[] args) {
		//<> is type safe
		//without<> is type unsafe
		
		SortedSet <String> deptNames = new TreeSet<>();
		deptNames.add("Education");
		deptNames.add("Admin");
		deptNames.add("Accounts");
		deptNames.add("Research");
		deptNames.add("Placement");
//		deptNames.add(10);
		
		for(String obj : deptNames) {
			System.out.println(obj);
		}
		System.out.println("------------------------------");
		SortedSet<Integer> deptNos = new TreeSet<>(); 
		deptNos.add(4);
		deptNos.add(1);
		deptNos.add(2);
		deptNos.add(5);
		deptNos.add(3);
		for(Integer deop : deptNos) {
			System.out.println(deop);
		}
	}
}

