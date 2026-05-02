package exceptionhandling;

public class multiplecatchblock {
	public static void main(String[] args) {
		int number[]=new int[4];
		try {
			int i=number[8];
			System.out.println("world");
		}
		catch(ArithmeticException e) {
			System.out.println("Welcome");
		}
		catch(StringIndexOutOfBoundsException u) {
			System.out.println("good bye");
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("hi");
		}
		catch(Exception j) {
			System.out.println("College");
		}
	}
}
