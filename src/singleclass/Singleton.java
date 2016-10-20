package singleclass;

/**
 * 单例类 （只能创建一个对象的类）
 * @author  Myth
 * @date 2016年10月13日 上午8:33:36
 * @TODO
 */
public class Singleton {
	//使用一个类变量来缓存曾经创建的实例
	private static Singleton instance;//（该类） 类型的类变量
	//对构造器使用private修饰，隐藏构造器
	private Singleton(){}
	//提供一个静态方法，用于返回Singleton实例
	//该方法可以加入自定义控制，保证只产生一个SIngleton对象
	public static Singleton getInstance(){
		//如果instance为null，则表明未创建对象，否则就是已经有了对象
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	public static void main (String [] args){
		//创建Singleton对象不能通过构造器
		//只能通过getInstance方法得到实例
		Singleton a1 = Singleton.getInstance();
		Singleton a2 = Singleton.getInstance();
		System.out.println(a1 == a2);//将输出true
	}
}
