
/*package park;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.util.Scanner;



 * ����д����������Ҫ�淶Щ����GregorianCanlendar ��ȡ�õ�ǰʱ��
 * DecimalFormat��������ת��ʱ���
 * ����ʹ�� ˳��ջ�������е����ݽṹ ���ʺ϶�������ԣ����������
 * ���ң����벻��ȫ����main��ģ�������ֻ�ж̶̵ļ��е��ú�����������Ĵ��룬���ϰ����Ҫ�ú�ѧϰ��
 */



/*public class demoparking {
	private SqStack S = new SqStack(100);               //˳��ջ���ͣ�����ڳ�����Ϣ
	private LinkQueue Q = new LinkQueue();           //�����д�ű���ϵĳ�����Ϣ
	private double fee  = 2;                                       //ÿ����ͣ������
	public final static int DEPARTURE = 0;
	public final static int ARRIVAL = 0;
	//�ڲ��࣡�����ڴ�ų�����Ϣ
	public class CarInfo{
		public int state;
		public GregorianCalendar arrTime;              //��������ʱ��
		public GregorianCalendar depTime;             //�����뿪ʱ��
		public String license;                                    //���ƺ�
	}
	//ͣ����������������license�����ƺ��룬action��ʾ�����Ķ���  ������뿪
	public void parkingManage(String license,String action) throws Exception{
		if ("arrive".equals(action)){                         //��������
			CarInfo info = new CarInfo ();                //����һ������
			info.license = license;                             //�޸ĳ���״̬
			if (S.length()<100){                                 //ͣ����δ��
				info.arrTime = (GregorianCalendar)GregorianCalendar.getInstance();  //��ǰʱ���ʼ������ʱ��
				info.state = ARRIVAL;
				S.push(info);
				System.out.println(info.license+"ͣ����ͣ������"+S.length()+"��λ�ã�");
			}
			else {
				Q.offer(info);
				System.out.println(info.license+"ͣ���ڱ����"+Q.length()+"��λ��");
			}
		}
		else if ("depart".equals(action)){              //�����뿪
			CarInfo info = null;                             
			int location  = 0;                                  //����λ��
			SqStack  s2 = new SqStack(S.length());
			//����һ����ջ���ڴ�������˳��뿪�����µ�����������ʱ�˳�����
			for (int i = S.length();i>0;i--){
				info = (CarInfo)S.pop();
				if (info.license.equals(license)){                                                               //���뿪�ĳ���
					info.depTime= (GregorianCalendar)GregorianCalendar.getInstance(); //��ǰʱ���ʼ���뿪ʱ��
					info.state = DEPARTURE;
					location = i;    //ȡ�ó���λ����Ϣ
					break;
				}
				else S2.push(info);                       //����������ʱ�˳�ͣ����
			}
			while (!S2.isEmpty()) S.push(S2.pop());  //������������ͣ����
			if (location != 0) {    //ͣ�����ڴ���ָ�����ƺ���ĳ���
				double time = (info.depTime.getTimeInMillis() - info.arrTime.getTimeInMillis()/(100*60))
						//����ͣ��ʱ�䣬���Ѻ���ת���ɷ���
						DecimalFormat df = new DecimalFormat("0.0");         //��double���и�ʽ����������λ��Ч����
						System.out.println(info.license+"ͣ��"+df.format(time)+"���ӣ�����Ϊ��"+df.format(time*fee));
			}
			if (!Q.isEmpty()){//����ϵĵ�һ��������ͣ����
				info = (CarInfo) Q.poll();
				info.depTime = (GregorianCalendar)GregorianCalendar.getInstance();//��ǰʱ���ʼ���뿪ʱ��
				info.state = ARRIVAL;
				S.push(info);
			}
		}
	}
	public static void main(String [] args) throws Exception{
		demoparking pm  = new demoparking();   //��������
		for (int i=1;i<=12;i++)
			//��ʼ��12���������ƺ���1,2������12������10������ͣ�����ڣ�2�ڱ����
			pm.parkingManage(String.valueOf(i), "arrive");
		Scanner sc = new Scanner(System.in);
		System.out.println("�����복�ƺţ�");
		String license = sc.next();
		System.out.println("arrinve or depart?");
		String action = sc.next();
		pm.parkingManage(license, action);          //����ͣ����������
	}
}*/
