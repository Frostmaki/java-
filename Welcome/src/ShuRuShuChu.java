import java.io.Console;
import java.util.Scanner;

public class ShuRuShuChu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name=in.nextLine();
//		
//		System.out.println("How old are you?");
//		int age=in.nextInt();
//		
//		System.out.println(name+":"+age);

//		password
		Console cons=System.console();
		try {
		String username=cons.readLine("username:");
		char[] passwd=cons.readPassword("password:");
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		System.out.println(username+":"+passwd);
	}

}
