package first;

import java.util.Date;

public class num {
 
	 static int count;
	public void disp() {
		/*Date date = new Date();
		System.out.println("开始计算时间："+date.toLocaleString());
		for(int i=0 ;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+i);
				try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("结束计算的时间"+date.toLocaleString());*/
		
		// count = count+1;
		// System.out.println("disp方法"+count);
		
		//用类成员来做参数，要考虑共享问题，有一定可能是会出现问题的
		//非要共享的话最好加上锁
		synchronized (this) {
			count = count+1;  
			System.out.println("disp方法"+count);
		}
	}
	

}
