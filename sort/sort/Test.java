package sort;
import java.util.*;
/*
 * ȫ������ô��ܳ����ʱ�����ܣ���ʱ��ͱ���˵�±�Խ��
 * ���Բ�ͬ�����򷽷����Ƚ����������ʱ��
 * ����ʵ�飺��������0-100000ʱ
 *                  ���ݹ�ģ6��  ð��22s��ѡ��21s������2s��
 *                  ���ݹ�ģ 8��   ð�� 26s��ѡ��27s������6s
 *                  ��������0-10ʱ
 *                  ���ݹ�ģ10��  ð��6s��ѡ��44s������12s
 *                  0-20
 *                  ���ݹ�ģ��8�� ð��3s��ѡ��35s������8s
 *                  ��������0-5ʱ
 *                  ���ݹ�ģ    ð��11s��ѡ��57s������24s
 * �������ۣ�
 *                ð���ʺϴ������ݼ���С�Ĵ������ݣ������ʺϴ����������ݣ�ѡ���治�С���
 *                ��������1��ɱһ�С���������
 */
public class Test {
	public static void main(String [] args){
		System.out.println("main������ʼ�ˣ�");
		Bubble bubble = new Bubble();
		Insert insert = new Insert();
		Select select = new Select();
		Quick quick =new Quick();
		
		int [] dat = new int [150000];     //������������������С
		for (int i=0;i<dat.length;i++){
			dat[i] =(int)(Math.random()*20);//ǿ������ת����int ���ȫ�����0�ˣ�����
			//֪��ԭ���ˣ���Ҫ��������ǿ������ת�����������int��Ȼ��0�ˣ���Ϊ�������0��1
		}
		//for (int i =0;i<dat.length;i++)   //���������һ��
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
		cal = Calendar.getInstance();               //��ȡϵͳʱ��
		System.out.println(cal.getTime());      //���ʱ��
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
