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
 * ���ȣ��ɹ��������Ҫ�󣬵��ǲ��������ʵ�֣�����һЩ��ѧϰ��������ʵ�ֵģ���������
 * Ӧ��Ҫ������ջ��ͣ���������û����·,����һ��ջ��Ӧ���Ƕ��У�������ջ������������ô�����Ĵ���
 * �����ջ����ջ��������ѭ��˳�����
 * ������ջ���ϲ��Ʒѣ�ͣ�����ڼƷѣ��Ѿ�������
 * ��ô�������ˣ������ڱ���ʱ��Щʱ����ô�󣿣��������˹��ˣ�Ҫ��Ȼtatus�������ò�����
 */
 
public class P {
	static int i=0;//����ͣ������λ��
	public static void main(String [] ags){

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//����ʱ���ʽ
		System.out.println(df.format(new Date()));//new Date�����ǻ�ȡϵͳ��ǰʱ��
		
		LinkStack park = new LinkStack();//ջ��ͣ����
		LinkStack cache = new LinkStack();//ջ�����õ�·
		Queue load = new Queue(34);//���У����
		
		System.out.println("main������ʼ���У�");
		//������һ����̽���ȷ�һ�������ԣ�������֮���ǻᱻ���ǵ�
		Car cars = new Car("1");
		cars.startTime();
        Scanner s = new Scanner(System.in);//      �����������s ��ȫ�ֶ�����s������
        int k = s.nextInt();
        System.out.println(k);
		System.out.println("fee = "+cars.fees()+" RMB");
		
		while(true){
			
			System.out.println("���������Ĳ���:\n1.��    2.��    ");k = s.nextInt();
			Car [] a = new Car[4];//������Ǵ�����Car����������ڴ洢���������(û�ж�����ڴ�ռ�) �ܴ��(�����С��һ)����
		   
			//����������ջ�����������С������ͣ������С�������ǽ����̶���С��˳��ջ
			
			switch(k){
			case 1:
			{
				
				if (i<a.length-1){
					System.out.print("�����복�ƺţ�  ");
					String carno = s.next();
					Car car = new Car(carno);
					car.ArriveTime = df.format(new Date());
					park.push(car);
					car.startTime();//��ʼ��ʱ
					a[++i] = car;//��һ����λ�þ���1 ��ʾ���һ������λ��
				}
				else {//ͣ�������˾Ͱѳ�����ջ����ȥ�����շѣ�
					System.out.print("�����복�ƺţ�  ");
					String carno = s.next();
					Car car = new Car(carno);
					load.offer(car);
				}
			}break;
			case 2:
			{
				System.out.print("��������������ͣ������λ�ã�");
				int j = s.nextInt();//   ��λ������   //Car q=park.pop();//ֻ������ջ��Ԫ��
				if (j>i) System.out.println("���������ڣ�����");
				else{
						     for (int z=0;z<i-j;z++){//��jλ�ú�ĳ�������
						    	 cache.push(park.pop());}//��ͣ������ǰ��Ҫ����������·�ĳ�  ���뻺��ջ����
						   Car t =  park.pop(); 
						   t.GoTime = df.format(new Date());
						   System.out.println("��������ʱ��:"+t.ArriveTime+"\n��������ʱ��:"+t.GoTime);
						   System.out.println("����"+t.number+"���ܷ��� = "+t.fees()+" RMB");
						   for (int z=0;z<i-j;z++){park.push(cache.pop());}//�ѻ���ĳ�����ͣ����
						    i--;
						    if (!load.isEmpty()){//���ջ�������У������˵Ⱥ�ͰѵȺ�ĳ����ο���ͣ����
								   Car caches = load.poll();
								   park.push(caches) ;
								   a[++i] = caches;
								   caches.ArriveTime = df.format(new Date());
							       caches.startTime();
						   }	
					}
			}break;
			default :System.out.println("��������ȷѡ��");break;
			}
			System.out.println("ͣ����״̬(���� "+i+" ����)��->�ڣ�");
			park.display();
			System.out.println();
			if (!load.isEmpty()){
				System.out.print("ջ���ϻ��У�");
				load.display();
				System.out.println();
			}
		}
		
	}
}
