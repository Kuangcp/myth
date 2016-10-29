package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 全看运气么，艹，有时候能跑，有时候就报错说下标越界，是因为二分法没有检查游标上移的情况
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
 *             冒泡适合处理数据极差大的大量数据，插入适合处理各种数据表现都可以，选择和冒泡差不多
 *             快速排序1秒杀一切。。。。。
 *             
 *             急需使用多线程来加速，不然大数据量下的排序实在是太慢了
 */
public class TestSortTime {
	
	static final int MOUNT=200000;//这里来控制数据量大小
	static final int SCOPE = 1000;//数据范围
	static final int SORTDATA=5;//参与排序的方法数
	static final boolean display=false;//是否展示排序前后数据
	
	/**
	 * 创建一个List，里面的int[] 数据是相同的，但是内存地址不一样
	 * @return List<int []>
	 */
	public static List<int []> createDat(){
		List<int []> data = new ArrayList<int []>();
		/**创建数据容器*/
		for (int i=0;i<SORTDATA;i++){
			int [] dat1 = new int [MOUNT];
			data.add(dat1);//这里虽然是同一个引用，但是是不同的内存，所以数据是相互独立的，不会出现同一个的情况
			//但是如果是同一个内存，执行多次add，List会直接引用第一次add的地址，不会真正的add进去
//			data.add(new int[MOUNT]);//不能直接写一个new 要有引用指向它
		}
		/**产生大量数据*/
		for (int i=0;i<MOUNT;i++){
			int temp = (int)(Math.random()*SCOPE);
			//强制类型转换成int 后就全部变成0了？？？
			//知道原因了，是要对 运算结果 强制类型转换，对随机数强转int当然是0了，因为随机数是0到1
			for(int j=0;j<SORTDATA;j++){
				data.get(j)[i] = temp;
			}
		}
		return data;
	}
	
	public static void main(String [] args){
		System.out.println("数据量是:"+MOUNT+"\n数据范围是:0~"+SCOPE);
		GetRunTime time = new GetRunTime();
		List<int []> data = createDat();
		
//		display(data.get(0));
//		TestQuick(data.get(0), time);
		TestBubble(data.get(1), time, display);
		TestInsert(data.get(2), time, display);
		TestSelect(data.get(3), time, display);
		TestShell(data.get(4), time, display);
	}
	
	/**测试快速排序*/
	public static void TestQuick(int [] dat,GetRunTime time,boolean display ){
		if(display){System.out.print("未排序          ");display(dat);}
		time.Start();
		Quick quick =new Quick();
		quick.sort(dat);
		time.End("\n##quick     :");
		if(display){System.out.println("已排序");display(dat);}
	}
	/**测试冒泡排序*/
	public static void TestBubble(int [] dat,GetRunTime time,boolean display ){
		if(display){System.out.print("未排序          " );display(dat);}
		time.Start();
		Bubble bubble = new Bubble();
		
		bubble.sort(dat); 
		time.End("\n##insert  time   :");
		//for (int i =0;i<dat.length;i++)
			//System.out.println(dat[i]);
		if(display){System.out.println("已排序");display(dat);}
	}
	/**测试插入排序*/
	public static void TestInsert(int [] dat,GetRunTime time,boolean display ){
		if(display){System.out.print("未排序      ");display(dat);}
		time.Start();
		Insert insert = new Insert();
		
		insert.sort(dat);
		time.End("\n##insert  time   :");
		//for (int i =0;i<dat.length;i++)
			//System.out.println(dat[i]);
		if(display){System.out.println("已排序");display(dat);}
	}
	/**测试选择排序*/
	public static void TestSelect(int [] dat,GetRunTime time,boolean display ){
		if(display){System.out.print("未排序     ");display(dat);}
		time.Start();
		Select select = new Select();
		
		select.sort(dat);
		//for (int i =0;i<dat.length;i++)
			//System.out.println(dat[i]);
		time.End("\n##select     :");
		if(display){System.out.println("已排序");display(dat);}
	}
	public static void TestShell(int [] dat,GetRunTime time,boolean display ){
		if(display){System.out.print("未排序     ");display(dat);}
		time.Start();
		Shell shell = new Shell();
		shell.sort(dat);
		time.End("\n Shell      :");
		if(display){System.out.println("已排序");display(dat);}
	}
	public static void display(int [] dat){
//		System.out.println("遍历"+dat.length);
		for (int i =0;i<dat.length;i++) {  //将数组遍历一下
//			System.out.println("jk");
			System.out.print(dat[i]+"|");
			if(i%46==45) System.out.println();
		}
	}

}
