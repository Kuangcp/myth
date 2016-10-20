package park;

//import java.io.IOException;
//import java.util.TimerTask;
//import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.util.Timer;
//import java.util.TimerTask;
import java.util.Scanner;
/*
 * 进度：成功完成所有要求，但是不是正规的实现，靠着一些能学习到的类来实现的，还需完善
 * 应该要有两个栈，停车场，避让缓存道路,还有一个栈道应该是队列，不能用栈，，，犯了这么致命的错误！
 * 这里的栈是链栈，队列是循环顺序队列
 * 车子在栈道上不计费，停车场内计费（已经做到）
 * 那么问题来了，车子在避让时那些时间怎么求？？真是日了狗了，要不然tatus变量就用不上了
 */
 
public class P {
	static int i=0;//车在停车场的位置
	public static void main(String [] ags){

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置时间格式
		System.out.println(df.format(new Date()));//new Date（）是获取系统当前时间
		
		LinkStack park = new LinkStack();//栈：停车场
		LinkStack cache = new LinkStack();//栈：避让道路
		Queue load = new Queue(34);//队列：便道
		
		System.out.println("main函数开始运行！");
		//下面是一个试探，先放一辆车试试，这辆车之后是会被覆盖的
		Car cars = new Car("1");
		cars.startTime();
        Scanner s = new Scanner(System.in);//      建立输入对象s ，全局都在用s来输入
        int k = s.nextInt();
        System.out.println(k);
		System.out.println("fee = "+cars.fees()+" RMB");
		
		while(true){
			
			System.out.println("请输入您的操作:\n1.进    2.出    ");k = s.nextInt();
			Car [] a = new Car[4];//这里就是创建了Car类的数组用于存储对象的引用(没有对象的内存空间) 能存放(数组大小减一)辆车
		   
			//这里是用链栈的引用数组大小来限制停车场大小，而不是建立固定大小的顺序栈
			
			switch(k){
			case 1:
			{
				
				if (i<a.length-1){
					System.out.print("请输入车牌号：  ");
					String carno = s.next();
					Car car = new Car(carno);
					car.ArriveTime = df.format(new Date());
					park.push(car);
					car.startTime();//开始计时
					a[++i] = car;//第一辆车位置就是1 表示最后一辆车的位置
				}
				else {//停车场满了就把车开到栈道上去（不收费）
					System.out.print("请输入车牌号：  ");
					String carno = s.next();
					Car car = new Car(carno);
					load.offer(car);
				}
			}break;
			case 2:
			{
				System.out.print("请输入您车辆在停车场的位置：");
				int j = s.nextInt();//   将位置输入   //Car q=park.pop();//只是退了栈顶元素
				if (j>i) System.out.println("车辆不存在！！！");
				else{
						     for (int z=0;z<i-j;z++){//把j位置后的车开出来
						    	 cache.push(park.pop());}//将停车场因前面要出来车而让路的车  开入缓存栈道中
						   Car t =  park.pop(); 
						   t.GoTime = df.format(new Date());
						   System.out.println("车辆开入时间:"+t.ArriveTime+"\n车辆开出时间:"+t.GoTime);
						   System.out.println("车辆"+t.number+"的总费用 = "+t.fees()+" RMB");
						   for (int z=0;z<i-j;z++){park.push(cache.pop());}//把缓存的车开回停车场
						    i--;
						    if (!load.isEmpty()){//如果栈道（队列）上有人等候就把等候的车依次开入停车场
								   Car caches = load.poll();
								   park.push(caches) ;
								   a[++i] = caches;
								   caches.ArriveTime = df.format(new Date());
							       caches.startTime();
						   }	
					}
			}break;
			default :System.out.println("请输入正确选择！");break;
			}
			System.out.println("停车场状态(共有 "+i+" 辆车)外->内：");
			park.display();
			System.out.println();
			if (!load.isEmpty()){
				System.out.print("栈道上还有：");
				load.display();
				System.out.println();
			}
		}
		
	}
}
