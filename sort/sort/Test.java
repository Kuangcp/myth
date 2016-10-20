package sort;
import java.util.*;
/*
 * 全看运气么，艹，有时候能跑，有时候就报错说下标越界
 * 测试不同的排序方法，比较其各自所费时间
 * 初步实验：当数据是0-100000时
 *                  数据规模6万  冒泡22s，选择21s，插入2s；
 *                  数据规模 8万   冒泡 26s，选择27s，插入6s
 *                  当数据是0-10时
 *                  数据规模10万  冒泡6s，选择44s，插入12s
 *                  0-20
 *                  数据规模是8万 冒泡3s，选择35s，插入8s
 *                  当数据是0-5时
 *                  数据规模    冒泡11s，选择57s，插入24s
 * 初步结论：
 *                冒泡适合处理数据极差小的大量数据，插入适合处理极差大的数据，选择真不行。。
 *                快速排序1秒杀一切。。。。。
 */
public class Test {
	public static void main(String [] args){
		System.out.println("main函数开始了！");
		Bubble bubble = new Bubble();
		Insert insert = new Insert();
		Select select = new Select();
		Quick quick =new Quick();
		
		int [] dat = new int [150000];     //这里来控制数据量大小
		for (int i=0;i<dat.length;i++){
			dat[i] =(int)(Math.random()*20);//强制类型转换成int 后就全部变成0了？？？
			//知道原因了，是要对运算结果强制类型转换，对随机数int当然是0了，因为随机数是0到1
		}
		//for (int i =0;i<dat.length;i++)   //将数组遍历一下
			//System.out.print(dat[i]);
		//System.out.println();
		Calendar cal = Calendar.getInstance();
		  
		for (int i=7;i<dat.length;i++){
			dat[i] =(int)(Math.random()*1000000);}
		
		System.out.println("\n##quick     :" );
		cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		quick.sort(dat);
		cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		
		System.out.println("\n##bubble  time  :");System.out.println(cal.getTime());
		bubble.sort(dat); 
		cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		//for (int i =0;i<dat.length;i++)
			//System.out.println(dat[i]);
		
		
		
		for (int i=0;i<dat.length;i++){
			dat[i] =(int)(Math.random()*1000000);}
		System.out.println("\n##insert  time   :" );
		cal = Calendar.getInstance();               //获取系统时间
		System.out.println(cal.getTime());      //输出时间
		insert.sort(dat);
		cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		//for (int i =0;i<dat.length;i++)
			//System.out.println(dat[i]);
		
		
		
		for (int i=0;i<dat.length;i++){
			dat[i] =(int)(Math.random()*1000000);}
		System.out.println("\n##select     :" );
		cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		select.sort(dat);
		cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		//for (int i =0;i<dat.length;i++)
			//System.out.println(dat[i]);
		
		
	}

}
