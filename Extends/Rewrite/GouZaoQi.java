package Rewrite;
/*
 * 这个就是继承的状态下的构造器实现的状态
 * 先是实现静态初始化块一次，然后每次使用构造器时实现普通初始化一次 从父类到子类 按顺序来实现
 * 子类怎么调用间接父类的构造器？？？
 
 */


/* 
 * 运行结果：
 * 第一次创建对象::::::::::

Root 的静态初始化块
Mid  的静态初始化块
Leaf 的静态初始化块

Root 的普通初始化块   //按顺序构造
Root 的无参构造器
Mid 的普通初始化块
Mid 的无参构造器
Mid 的有参构造器，参数值为：疯狂Java讲义
Leaf 的普通初始化块
执行Leaf 的构造器


第二次创建对象::::::::::

Root 的普通初始化块
Root 的无参构造器
Mid 的普通初始化块
Mid 的无参构造器
Mid 的有参构造器，参数值为：疯狂Java讲义
Leaf 的普通初始化块
执行Leaf 的构造器
 */
class Root {
	static {
		System.out.println("Root 的静态初始化块");
	}
	{
		System.out.println("Root 的普通初始化块");
	}
	public Root(){
		System.out.println("Root 的无参构造器");
	}
	public Root(String m){
		System.out.println("Root 的含参构造器 参数为："+m);
	}
}

class   Mid extends Root {
	static {
		System.out.println("Mid  的静态初始化块");
	}
	{
		System.out.println("Mid 的普通初始化块");
	}
	public Mid(){
		System.out.println("Mid 的无参构造器");
	}
	public Mid(String msg){
		// 通过this调用同一类中重载的构造器
		this ();//可以不要这句话，我还觉得奇怪，一个参数还要无参构造一次干嘛。。
		System.out.println("Mid 的有参构造器，参数值为："+msg);
	}
}
class Leaf extends Mid{
	static {
		System.out.println("Leaf 的静态初始化块\n");
	}
	{
		System.out.println("Leaf 的普通初始化块");
	}
	public Leaf(){
		//  通过super调用父类中有一个字符串参数的构造器
		super("疯狂Java讲义");                     //使用了直接父类Mid的构造器
		//如果说是按语句的顺序来执行的话，应该先输出Leaf的普通初始化代码块 再进行Mid的含参构造器
		// 然而这里并不是，而是将父类的构造器全执行完再使用子类的，不管那个父类构造器是在子类的构造器里
		System.out.println("执行Leaf 的构造器\n\n");
	}
}
public class GouZaoQi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第一次创建对象::::::::::\n");
		new Leaf();
		System.out.println("第二次创建对象::::::::::\n");
		new Leaf();

	}

}
