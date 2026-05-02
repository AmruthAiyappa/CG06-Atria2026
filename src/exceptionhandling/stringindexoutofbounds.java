package exceptionhandling;

public class stringindexoutofbounds {
	public static void main(String[] args) {
		String str="atria college";
		try {
			char ch=str.charAt(20);
		}
		catch(StringIndexOutOfBoundsException r){
			System.out.println(r);
		}
		System.out.println("Exception caught");
	}
}
