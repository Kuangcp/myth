package Thread1;
/**
 * �����߳� main ��t1 t2 Test�е�run���̵߳Ĵ���  �����for��main�Ĵ���
 * @author lenovo
 *
 */
class Test extends Thread{
	//private String name ;
	Test (String name){
		//this.name = name;
		super (name);//Constructor call must be the first statement in a constructor
		//������ Constructor  Ҫ�ڵ�һ��
	}
	public void run(){
		for (int x=0 ;x<20;x++){//x������ִ�д���
			System.out.println((Thread.currentThread() == this)+"...."+this.getName()+"run.."+x);
			/*public static Thread currentThread()���ضԵ�ǰ����ִ�е��̶߳�������á� */
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
		for (int i=0;i<20;i++){//i��mainִ�еĴ���
			System.out.println("main...."+i);
		}
	}

}
