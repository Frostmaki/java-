
public class ZiFuChuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting="hello,everyone";
		
		
		//substring
		//从greeting【5】开始，到【8】结束，不包括【8】，string。length=8-5
		String s=greeting.substring(5,8);
		System.out.println(s);
		
//		拼接
		String name="han meimei :";
		String age="13";
		String message=name+age;
		System.out.println(message);
		
//		修改字符串
	    greeting=greeting.substring(0,13)+"e !";
	    System.out.println(greeting);
	    
//	    相等
	    System.out.println("Hello".equals("Hello"));
	    System.out.println("hello".equalsIgnoreCase("HELLO"));

	    
//	    构建字符串
	    StringBuilder builder=new StringBuilder();
	    builder.append("hello");
	    builder.append('c');
	    builder.insert(3, "new");//从【3】的位置开始插入
	    String completedString=builder.toString();
	    System.out.println(completedString);
	}

}
