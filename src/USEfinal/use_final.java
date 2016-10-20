package USEfinal;
/*
 * final 就是c语言的 const 就是用来定义一个常量的
 * final：
 *       修饰的<方法>不能被子类覆盖
 *       修饰的<变量>不能被更改，且要显式初始化
 *       修饰的<类>不能被继承
 */

class A{
	final double  rate_pi = 3.1415926;//final就是常用下划线来定义常量名字
	int a ;//    普通变量  如果不给初值,java自动初始化 
	final public void send(){
		//      加了final后这个类的这个方法不能被重写    就是说只能有一个
		System.out.println("发送消息！");
	}
	public void show (){
		System.out.println(a);
	}
}
class B extends A{
	public B()
	{
		a++;
		//rete_pi++; 报错的原因就是 final的变量不能被更改
	}
	//public void send(){} 这一行就会报错，说是send不能被重写
}
public class use_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s = new A();
		s.show();
		B d =new B();
		s.show();//为甚么，原来的的类就没有a++？
		d.show();//他的子类就加了？
		//初步解释：s 和 d 两个对象是不同的内存空间

	}

}
  