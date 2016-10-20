package pck;

public class statics {
	public static void main(String [] args){
		ui u =  new ui("a");
		/*
		ui uo = new ui("s");
		ui uop = new ui("d");
		ui uio = new ui("f");
		*/
		System.out.println("对象共创建了："+ui.getcore()+"个"+"名字是："+u.name);
		//u.t();      //对象:   对象能调用类方法，但是这里有个警告，也就是说  可以  但不合适
		ui.t();       //类:   这是完全正确的用类来调用类的方法
		u.P();
		//ui.P(); 错误：类不能调用非静态方法
		//ui.name = "kl";错误：类不能调用非静态变量
        //总结：类只能调用类方法，对象都能调用   类方法和普通方法（变量也是如此）
		System.out.println("主程序");
	}

}
class ui{
	String  name;
	 static int core=0;
	 //类变量，这里是用来统计创建了多少个对象的 如果不加static，内存位置都不一样
	static{//（初始化代码块）静态区代码，只在构造器创建对象时调用，且只能实现一次
		System.out.println("类的静态区");
	}
	public ui(String a){
		name = a;
	    core++;  
	}
	public static int getcore(){return core;}//类方法来读取类变量
	void P(){System.out.println("普通方法");}
	static void t(){
		System.out.println("类方法");
	}
}
/* 类只能调用类方法，对象都能调用   类方法和普通方法
 * （变量也是如此）
 * 静态方法只能访问静态变量，非静态则都可以访问
 * 类变量原则上是用类方法去操作和访问
 * 类变量就是有一个所有对象都共享的属性
 */
