package first;

/**
 * 从结果来看，线程1和2 有时候1先有时候2先，但是i的值总是相等的，00 11 22 33 ....
 * 这是什么原理 三个四个线程都是如此 
 * 难道是因为队列机制？
		线程1 0
		线程2 0
		线程1 1
		线程2 1
		线程1 2
		线程2 2
		线程1 3
		线程2 3

 * @author lenovo
 * 总共四个线程
 * main的线程是输出三句话，而三个线程调起了disp方法，但是main还没结束三个线程就开始了，往往线程开始时间不确定，全看cpu心情
			main开始
			线程1
			线程2
			线程3
			disp方法1
			disp方法2
			main结束
			disp方法3
			
加上锁后：测试多次结果都是一样，但是安全点
 */
public class demo1 {

	public static void main(String[] args) {
		System.out.println("main开始");
		// TODO Auto-generated method stub

		num j = new num();
		
		System.out.println("线程1");
		fsh t  = new fsh();
		t.setNum(j);
		t.setName("线程1 ");
		
		System.out.println("线程2");
		fsh t2 = new fsh();
		t2.setNum(j);
		t2.setName("线程2 ");
		
		System.out.println("线程3");
		fsh t3  = new fsh();
		t3.setNum(j);
		t3.setName("线程3 ");
		
		t.start();//开始一个线程
		t2.start();
		t3.start();
		//t3.start(); 这句话加上后显然会抛异常，但是它还是继续运行出了正确结果
		
		System.out.println("main结束");
	}

}
