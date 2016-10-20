package jiekou;
/*
 * 使用接口：
 *  1、定义变量，也可使用于进行强制类型转换
 *  2、调用接口中定义的常量
 *  3、被其他类实现
 *  
 *  接口的成员变量 自动添加 public static final 修饰符
 *  接口的方法只能是：抽象方法，类方法，或默认方法。普通方法是不能实现的，但是类方法必须实现（有方法体）
 *  接口里的方法 会自动添加public abstract 修饰符
 */
public interface Output {
	
	//不是说接口里面的方法是可以有方法体的么，抽象类才没有体
	//接口里定义的成员只能是常量  默认加上final修饰符
	int MAX_CACHE = 20;
	//接口里定义的普通方法只能是public的抽象方法
	void out();
	void getData(String msq);
	void print(String ...msqs);/*{
		for (String msq :msqs) System.out.println(msq);
	}*/
	 void test();/*{
		System.out.println("默认的test方法");
	}*/
	//在接口中可以定义类方法(Java8允许)，需要使用static修饰(修饰了就报错了)
	//static String Test();/*{//静态的即类的方法，只能通过接口来调用
		//编译器报错：Illegal modifier for the interface method staticTest; only public & abstract are permitted
		//return "接口里的方法";
	//}*/

}
