package exceptionhandling;

public class nullpointerexception {
	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(Exception f) {
			System.out.println(f.getMessage());
		}
	}
}