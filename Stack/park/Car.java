package park;

import java.util.Timer;
import java.util.TimerTask;

public class Car {
	String status;//��¼״̬����û�õ�
	public String number="";//���ƺ�
	String ArriveTime;//��ʱ��û�õ�����ΪҪ��ȡϵͳ��ǰʱ��,ʵ��Ӧ�úü�
	String GoTime;
	 int TotalTime=0;//��ʱ��
	double fee=5;//ÿСʱ�ķ���5RMB
	public Car(String s){
		number = s;
	}
	public   void startTime(){
		 final Timer timer = new Timer();//Ϊʲôһ��Ҫ��final���η�
		//��������һ������
		timer.schedule(new TimerTask() {
            public void run() {
              TotalTime++;
              if (TotalTime >= 360) timer.cancel();//ֹͣ��ʱ�����룬�Ҿ����˷ѵ�����Դ���ѵ��Կ�����=_=
              //Ȼ���������ĺ������ʱ�����ͳ�Ƶ�17s�����ָĴ������
            }
        }, 0,1000);//��ʱ��������0ms�ӳٿ�ʼ����ÿ1000ms��һ�������ڴ��룩
	}
	public double fees(){
		System.out.println("�ܹ�ͣ����"+TotalTime+" s");
		return TotalTime*fee;//�ܹ�����Сʱ*ÿСʱ�ķ���
	}
}
