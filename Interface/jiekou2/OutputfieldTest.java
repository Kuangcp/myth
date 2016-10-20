package jiekou2;

public class OutputfieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//访问另一个包中的Output接口的MAX_CACHE
		System.out.println(jiekou.Output.MAX_CACHE);//接口相当于是一个特殊的类，跨包访问接口的变量
		//下面语句将引发“为final变量赋值”的编译错误
		//jiekou.Output.MAX_CACHE = 4;错误：The final field Output.MAX_CACHE cannot be assigned
		//使用接口来调用类方法
		System.out.println(jiekou.Output.MAX_CACHE);
	}

}
