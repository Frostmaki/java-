
import static java.lang.Math.*;

public class Welcome {
	
	public static final double DISCOUNT =5.5;
	public static void main(String[] args) {
		String greeting="welcome to core java";
		System.out.println(greeting);
		for(int i=0;i<greeting.length();i++) {
			System.out.print("=");
		}
		System.out.println();
		double x=4;
		double y=Math.sqrt(x);
		System.out.println(y);
		System.out.println(PI);
		
		int n=12345678;
		float f=n;
		double g=n;
		System.out.println(f);
		System.out.println(g);
		System.out.println((int)round(0.9));
		
		
		
	}
}
