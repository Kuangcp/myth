package park;

import java.util.Timer;
import java.util.TimerTask;

public class Car {
	String status;//记录状态，都没用到
	public String number="";//车牌号
	String ArriveTime;//暂时还没用到，因为要读取系统当前时间,实现应该好简单
	String GoTime;
	 int TotalTime=0;//总时间
	double fee=5;//每小时的费用5RMB
	public Car(String s){
		number = s;
	}
	public   void startTime(){
		 final Timer timer = new Timer();//为什么一定要加final修饰符
		//下面这是一个整体
		timer.schedule(new TimerTask() {
            public void run() {
              TotalTime++;
              if (TotalTime >= 360) timer.cancel();//停止定时器代码，我就怕浪费电脑资源，把电脑卡死了=_=
              //然后这样做的后果就是时间最多统计到17s把数字改大可以了
            }
        }, 0,1000);//定时器（先以0ms延迟开始，再每1000ms做一次括号内代码）
	}
	public double fees(){
		System.out.println("总共停放了"+TotalTime+" s");
		return TotalTime*fee;//总共多少小时*每小时的费用
	}
}
