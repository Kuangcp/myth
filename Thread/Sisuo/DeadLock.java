package Sisuo;

class A {
	public synchronized void foo(B b){
		System.out.println("当前线程名："+Thread.currentThread().getName()+"进入了A实例的foo()方法"); //  >> 1
		try {
			Thread.sleep(200);
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("当前线程名："+Thread.currentThread().getName()+"企图调用B实例的last()方法");//  >> 3
		b.last();
	}
	public synchronized void last(){
		System.out.println("进入了A类的last()方法内部");
	}
}
class B{

	public synchronized void bar (A a) {
		System.out.println("当前线程名："+Thread.currentThread().getName()+"进入了B实例的bar()方法");//  >>2
		try{
			Thread.sleep(200);
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("当前线程名："+Thread.currentThread().getName()+"企图调用A实例的list()方法");//  >> 4
		a.last();
	}
	public synchronized void last(){
		System.out.println("进入了B类的last()方法内部");
	}
}
public class DeadLock implements Runnable{

	A a = new A();
	B b = new B();
	public void init(){
		Thread.currentThread().setName("主线程 ");
		a.foo(b);
		System.out.println("进入了主线程之后");
	}
	public void run (){
		Thread.currentThread().setName("副线程 ");
		b.bar(a);
		System.out.println("进入了副线程之后");
	}
	
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		new Thread(dl).start();//以dl为target启动线程
		dl.init();//调用init()方法
	}

}
/*
 * 当两个线程互相等待对方释放同步监视器时就会发生死锁，java虚拟机没有监测，也没有采取措施来处理死锁情况，所以多线程编程时应该采取措施避免死锁，一旦出现死锁，整个程序
 * 既不会发生任何异常，也不会给出任何提示，只是所有线程处于阻塞状态，无法继续。
 * 死锁是很容易发生的，尤其在系统中出现多个同步监视器的情况下，上面的程序就会出现死锁。
 */
/**
 * 程序既无法向下执行，也不会抛出任何异常，就一直僵持着，究其原因，是因为：上面程序中A和B对象的方法都是同步方法
 * 也就是说，A和B对象都是同步锁，程序中两个线程执行，一个线程的执行体是DeadLock类的run方法另一个是DeadLock类的init()方法（主线程调用了init方法）
 * 其中run()方法中让B对象的foo()方法，进入foo()方法之前，该线程对A对象加锁——当程序执行到1号代码时，主线程暂停200ms ；CPU切换到执行另一行线程，
 * 让B对象执行bar()方法，所以看到副线程开始执行B实例的bar()方法，进入bar()方法之前，该线程对B对象加锁——当程序执行到2号代码时，副线程也暂停200ms
 * 接下来主线程会醒过来，继续向下执行，直到3号代码处希望调用B对象的last()方法——执行该方法之前必须先对B对象加锁，但此时副线程正保持着B对象的锁
 * 所以主线程阻塞；接下来副线程应该也醒过来了，继续向下执行，直到4号代码处希望调用A对象的last()方法——执行该方法之前必须先对A对象加锁，但此时主线程没有释放对A对象的锁
 * 至此，就出现了两个线程保持着A对象的锁，等待对B对象加锁，而副线程保持着B对象的锁，等待对象A加锁，两个线程互相等待对方先释放，所以就出现了死锁。
 */



