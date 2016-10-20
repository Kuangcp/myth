package Thread1;
/**
 * 三个线程 main 和t1 t2 Test中的run是线程的次数  后面的for是main的次数
 * @author lenovo
 *
 */
class Test extends Thread{
	//private String name ;
	Test (String name){
		//this.name = name;
		super (name);//Constructor call must be the first statement in a constructor
		//构造器 Constructor  要在第一行
	}
	public void run(){
		for (int x=0 ;x<20;x++){//x参数是执行次数
			System.out.println((Thread.currentThread() == this)+"...."+this.getName()+"run.."+x);
			/*public static Thread currentThread()返回对当前正在执行的线程对象的引用。 */
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test("one---");
		Test t2 = new Test("two+++");
		t1.start();
		t2.start();
		for (int i=0;i<20;i++){//i是main执行的次数
			System.out.println("main...."+i);
		}
	}

}
