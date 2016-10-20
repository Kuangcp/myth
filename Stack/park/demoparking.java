
/*package park;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.util.Scanner;



 * 这种写法看起来就要规范些，类GregorianCanlendar 能取得当前时间
 * DecimalFormat就是用来转化时间的
 * 这里使用 顺序栈，链队列的数据结构 更适合对象的特性，更容易理解
 * 而且，代码不是全放在main里的，主方法只有短短的几行调用函数输入输出的代码，这个习惯是要好好学习的
 */



/*public class demoparking {
	private SqStack S = new SqStack(100);               //顺序栈存放停车场内车辆信息
	private LinkQueue Q = new LinkQueue();           //链队列存放便道上的车辆信息
	private double fee  = 2;                                       //每分钟停车费用
	public final static int DEPARTURE = 0;
	public final static int ARRIVAL = 0;
	//内部类！！用于存放车辆信息
	public class CarInfo{
		public int state;
		public GregorianCalendar arrTime;              //车辆到达时间
		public GregorianCalendar depTime;             //车辆离开时间
		public String license;                                    //车牌号
	}
	//停车场管理函数，参数license代表车牌号码，action表示车辆的动作  到达或离开
	public void parkingManage(String license,String action) throws Exception{
		if ("arrive".equals(action)){                         //车辆到达
			CarInfo info = new CarInfo ();                //构造一个车辆
			info.license = license;                             //修改车辆状态
			if (S.length()<100){                                 //停车场未满
				info.arrTime = (GregorianCalendar)GregorianCalendar.getInstance();  //当前时间初始化到达时间
				info.state = ARRIVAL;
				S.push(info);
				System.out.println(info.license+"停放在停车场第"+S.length()+"个位置！");
			}
			else {
				Q.offer(info);
				System.out.println(info.license+"停放在便道第"+Q.length()+"个位置");
			}
		}
		else if ("depart".equals(action)){              //车辆离开
			CarInfo info = null;                             
			int location  = 0;                                  //车辆位置
			SqStack  s2 = new SqStack(S.length());
			//构造一个新栈用于存放因车辆退出离开而导致的其他车辆暂时退出车场
			for (int i = S.length();i>0;i--){
				info = (CarInfo)S.pop();
				if (info.license.equals(license)){                                                               //将离开的车辆
					info.depTime= (GregorianCalendar)GregorianCalendar.getInstance(); //当前时间初始化离开时间
					info.state = DEPARTURE;
					location = i;    //取得车辆位置信息
					break;
				}
				else S2.push(info);                       //其他车辆暂时退出停车场
			}
			while (!S2.isEmpty()) S.push(S2.pop());  //其他车辆进入停车场
			if (location != 0) {    //停车场内存在指定车牌号码的车辆
				double time = (info.depTime.getTimeInMillis() - info.arrTime.getTimeInMillis()/(100*60))
						//计算停放时间，并把毫秒转换成分钟
						DecimalFormat df = new DecimalFormat("0.0");         //对double进行格式化，保留两位有效数字
						System.out.println(info.license+"停放"+df.format(time)+"分钟，费用为："+df.format(time*fee));
			}
			if (!Q.isEmpty()){//便道上的第一辆车进入停车场
				info = (CarInfo) Q.poll();
				info.depTime = (GregorianCalendar)GregorianCalendar.getInstance();//当前时间初始化离开时间
				info.state = ARRIVAL;
				S.push(info);
			}
		}
	}
	public static void main(String [] args) throws Exception{
		demoparking pm  = new demoparking();   //构建对象
		for (int i=1;i<=12;i++)
			//初始化12辆车，车牌号是1,2，，，12，其中10辆车在停车场内，2在便道上
			pm.parkingManage(String.valueOf(i), "arrive");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入车牌号：");
		String license = sc.next();
		System.out.println("arrinve or depart?");
		String action = sc.next();
		pm.parkingManage(license, action);          //调用停车场管理函数
	}
}*/
