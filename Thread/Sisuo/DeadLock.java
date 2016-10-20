package Sisuo;

class A {
	public synchronized void foo(B b){
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"������Aʵ����foo()����"); //  >> 1
		try {
			Thread.sleep(200);
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"��ͼ����Bʵ����last()����");//  >> 3
		b.last();
	}
	public synchronized void last(){
		System.out.println("������A���last()�����ڲ�");
	}
}
class B{

	public synchronized void bar (A a) {
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"������Bʵ����bar()����");//  >>2
		try{
			Thread.sleep(200);
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"��ͼ����Aʵ����list()����");//  >> 4
		a.last();
	}
	public synchronized void last(){
		System.out.println("������B���last()�����ڲ�");
	}
}
public class DeadLock implements Runnable{

	A a = new A();
	B b = new B();
	public void init(){
		Thread.currentThread().setName("���߳� ");
		a.foo(b);
		System.out.println("���������߳�֮��");
	}
	public void run (){
		Thread.currentThread().setName("���߳� ");
		b.bar(a);
		System.out.println("�����˸��߳�֮��");
	}
	
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		new Thread(dl).start();//��dlΪtarget�����߳�
		dl.init();//����init()����
	}

}
/*
 * �������̻߳���ȴ��Է��ͷ�ͬ��������ʱ�ͻᷢ��������java�����û�м�⣬Ҳû�в�ȡ��ʩ������������������Զ��̱߳��ʱӦ�ò�ȡ��ʩ����������һ��������������������
 * �Ȳ��ᷢ���κ��쳣��Ҳ��������κ���ʾ��ֻ�������̴߳�������״̬���޷�������
 * �����Ǻ����׷����ģ�������ϵͳ�г��ֶ��ͬ��������������£�����ĳ���ͻ����������
 */
/**
 * ������޷�����ִ�У�Ҳ�����׳��κ��쳣����һֱ�����ţ�����ԭ������Ϊ�����������A��B����ķ�������ͬ������
 * Ҳ����˵��A��B������ͬ�����������������߳�ִ�У�һ���̵߳�ִ������DeadLock���run������һ����DeadLock���init()���������̵߳�����init������
 * ����run()��������B�����foo()����������foo()����֮ǰ�����̶߳�A�����������������ִ�е�1�Ŵ���ʱ�����߳���ͣ200ms ��CPU�л���ִ����һ���̣߳�
 * ��B����ִ��bar()���������Կ������߳̿�ʼִ��Bʵ����bar()����������bar()����֮ǰ�����̶߳�B�����������������ִ�е�2�Ŵ���ʱ�����߳�Ҳ��ͣ200ms
 * ���������̻߳��ѹ�������������ִ�У�ֱ��3�Ŵ��봦ϣ������B�����last()��������ִ�и÷���֮ǰ�����ȶ�B�������������ʱ���߳���������B�������
 * �������߳����������������߳�Ӧ��Ҳ�ѹ����ˣ���������ִ�У�ֱ��4�Ŵ��봦ϣ������A�����last()��������ִ�и÷���֮ǰ�����ȶ�A�������������ʱ���߳�û���ͷŶ�A�������
 * ���ˣ��ͳ����������̱߳�����A����������ȴ���B��������������̱߳�����B����������ȴ�����A�����������̻߳���ȴ��Է����ͷţ����Ծͳ�����������
 */



