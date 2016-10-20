package bigint;

public class test {//charAt是返回字符串类型的呀！！！
	public static void main(String []args){
		int s;
		String a="1234567gm";
		String b="01234fghj";
		s=a.charAt(4)+b.charAt(2);//charAt中的数字是下标位置
		System.out.printf("%c",(char)s);//可以通过强制类型转换来将int转换成字符型 
		
	}

}

