
public class ZiFuChuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting="hello,everyone";
		
		
		//substring
		//��greeting��5����ʼ������8����������������8����string��length=8-5
		String s=greeting.substring(5,8);
		System.out.println(s);
		
//		ƴ��
		String name="han meimei :";
		String age="13";
		String message=name+age;
		System.out.println(message);
		
//		�޸��ַ���
	    greeting=greeting.substring(0,13)+"e !";
	    System.out.println(greeting);
	    
//	    ���
	    System.out.println("Hello".equals("Hello"));
	    System.out.println("hello".equalsIgnoreCase("HELLO"));

	    
//	    �����ַ���
	    StringBuilder builder=new StringBuilder();
	    builder.append("hello");
	    builder.append('c');
	    builder.insert(3, "new");//�ӡ�3����λ�ÿ�ʼ����
	    String completedString=builder.toString();
	    System.out.println(completedString);
	}

}
