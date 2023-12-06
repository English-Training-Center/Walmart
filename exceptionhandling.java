package exception;
import java.io.File;
import java.io.FileInputStream;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int num = 0;
		int a[] = { 2, 4, 5, 6 };
		String str = null;
//		try {
//			System.out.println("Length of string  : " + str.length());
//			num = 100/0;
//			
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}catch(NullPointerException e) {
//			System.out.println(e);
//			str= "Abi";
//		}catch(Exception e) {
//			System.out.println("Exception occured :  " + e);
//		}
//		
//		System.out.println("Quotient  : " + num);
//		System.out.println("Length of string  : " + str.length());
//		try {
//			System.out.println(a[4]);
//		}catch(ArrayIndexOutOfBoundsException b){
//			System.out.println(b);
//		}
		try {
			try {
				System.out.println(a[5]);
			} catch (NumberFormatException c) {//this exception is mismatched by NumberFormatException instead of ArrayOutOfIndex,so the next line num=3/0 will not work.
				System.out.println(c);
			}
			num = 3 / 0;
		} catch (ArithmeticException d) {
			System.out.println(d);
//		} catch (Exception e) {
//			System.out.println(e);
		}finally {
			System.out.println("Finally executed");//used to close resources
		}

		System.out.println(num);
	}
}

