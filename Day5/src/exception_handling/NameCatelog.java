package exception_handling;

public class NameCatelog {
	private static String[] allName = {"Alex","Harry","Martin","Cris","Brain"};
	
	public static int getPosition(String name) throws NameNotFoundException {
		int position = -1;
		int size = allName.length;
		for(int index =0; index < size; index++) {
			String currentName = allName[index];
			if(name.equals(currentName)) {
				position = index;
				break;
			}
		}
		if(position == -1) {
			NameNotFoundException nx = new NameNotFoundException(name, "Unable to find name in catelog");
			throw nx;
		}
		return position;
	}
}
