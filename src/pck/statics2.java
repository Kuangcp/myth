package pck;
/*
 * 程序运行结果：

        类加载！
	main开始
	实例的初始化调用！
	实例初始化
	实例的初始化调用！
	实例初始化
	mian结束
	
 * 结论：
 * 静态初始化块（类初始化块）： 最先执行且只有一次
 * 普通初始化块 ：是在每次构造器创建对象之前执行
 * 
 */
public class statics2 {
    static {
		System.out.println("类加载！");
	}
	public statics2(){
		System.out.println("实例初始化");
	}
	{
		System.out.println("实例的初始化调用！");
	}
	public static void main(String[] args) {
		System.out.println("main开始");
		statics2 d1 = new statics2();
		 d1 = new statics2();
		 d1 = null;
		System.out.println("mian结束");
	}

}
