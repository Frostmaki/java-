import java.io.*;
import java.nio.file.Paths;
import java.util.*;

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
//		Java.io.Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的。
		
//		Console cons=System.console();
//		String username;
//		char[] passwd;
//		
//		username=cons.readLine("user name:");
//		
//		passwd=cons.readPassword("password:");
//		
//		
//		System.out.println(username+":"+passwd);
		
		double x=10000.0/3.0;
		System.out.printf("%7.2f",x);
		
//		%1$s %2$tB %2$te,%2$tY
		System.out.printf("%1$tB %1$te,%1$tY", new Date());
		
		try {
			//Scanner in=new Scanner(Paths.get("myfile.txt"),"UTF-8");
			PrintWriter out =new PrintWriter("myPrintFile.txt","UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
