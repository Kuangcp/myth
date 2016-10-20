package myth;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f ="jkljkl";
		int begin  = 1;
		char end = 3; //赋值是一个整数，如果给一个'r' 就会报数组越界的错误
		System.out.println(f.substring(begin,end));
		//虽然定义的函数形参是两个int类型，但是进去的char 会自动转成int
		
		
		String w = new String ("asdfghjk");  //这样是在堆内存里开辟一个字符串
		String h = "k";//还是堆区。。。但是放在String pool会有引用
		//这是不用new 的情况，用new来创建字符串就不会，因为new就是开辟内存，每次都在开辟，怎么可能会同址
		                                             
		                                  //String pool 字符池的机制
		//创建一个字符串变量或常量，都会在堆中有一个内存空间，而且会在字符池中留下引用，下次有同样的字符串的 时候就会 不开辟内存，直接指向之前已有的内存   
		String a = "jkl";
		String b = "jk";
		String c = "jk"+"l";//这是和a的地址相同的
		String d = b+"l"; //这是和a不等的
		if (a==d){  //双等号是比较内存 
			System.out.println("地址相等");
		}
		System.out.println(d);
		
		
		                           //new 的特点
		String j = new String ("jkl");
		String k = new String ("jkl");
		if (j == k) System.out.println("new 地址相等");
		if (j.equals(k)) System.out.println("new 值相等");
		//equal是区分字符大小写的，equalignore 就是忽略大小写

	}

}
