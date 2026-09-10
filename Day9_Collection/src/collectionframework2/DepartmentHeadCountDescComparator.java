package collectionframework2;

import java.util.Comparator;

public class DepartmentHeadCountDescComparator implements Comparator<Department>{

	@Override
	public int compare(Department firstDept, Department secondDept) {
		Integer firstHeadCount = firstDept.getHeadCount();
		Integer secondHeadCount = secondDept.getHeadCount();
		int comparison = secondHeadCount.compareTo(firstHeadCount);
		return comparison;
	}	
}
