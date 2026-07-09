package exceptionhandling;

public class arrayindexoutofbounds {
	public static void main(String[] args) {
		int[] arr= new int[5];
		try {
			int a=arr[7];
		}
		catch(ArrayIndexOutOfBoundsException r){
			System.out.println(r);
		}
		System.out.println("Exception caught");
	}
}
