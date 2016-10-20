package com.abstracts;
/**
 * 所以说在子类实例化的时候，是不能访问到父类的构造器的
 * 除非是在子类构造器中显式声明了调用super，那样的话，父类和子类同时得到了初始化，
 * 	那么问题来了，这样会不会损耗性能，如果是一个特别特别长的继承链？
 * @author  Myth
 * @date 2016年8月6日 下午5:54:04
 * @TODO
 */
public class A extends AbstractA{

	int a;
	String b;
	//若出现父子类属性同名的情况，那么父类的属性只是被隐藏，通过super才能访问到
	
	//构造器的加载顺序是Object，父类。。父类。。。。自己，所以抽象父类的构造方法也是在前面执行的，
	//抽象类的继承规则是，普通方法（包括构造器）是正常继承的，抽象方法是必须要由子类实现的
	public A(){System.out.println("A 构造器");}
	public A(int a, String b) {
		super(a, b);//如果使用了父类的构造器，那么初始化的是父类，而不是子类的属性
		this.a = a;
		this.b = b;
		System.out.println("A 含参构造器");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A(1,"w").M();
		
	}

	public void M() {
		// TODO Auto-generated method stub
		
		A df = new A(3,"df");
		System.out.println(df.a+df.b+super.a+super.b);
	}

}
