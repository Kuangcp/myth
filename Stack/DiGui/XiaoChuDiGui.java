package DiGui;

import stacks.*;
import java.util.Scanner;
/*
 * ��ջ�������ݹ飬����ģ��ݹ���ϵͳ������ջ 
 * �ݹ��ÿһ���˳������� ���ǳ�ջ
 * ÿһ�ν��뺯�� �����ǽ�ջ
 */
 public class XiaoChuDiGui {
	 public static void main(String [] args){
		 LinkStack Q = new LinkStack();Q.push(1);
		 Scanner sc  = new Scanner(System.in);
		 System.out.println("�����뺯���Ա�����ֵ");
		 int  m= sc.nextInt();
		 int n=m;
		 
		 double sum=1;
		 //�Ȱ�ʵ�������д��������ѡ����Ctrl+shift+o ���ٵ������ע�ⲻ�ܿ���Ŀ
		 while (Q.top!=null){
			 if (n==0) sum=sum*Q.pop();
			 else {Q.push(n);n/=2;}
		 }
		 System.out.println("������ֵ�ǣ�"+sum);
		
		 System.out.println("������ֵ�ǣ�"+f(m));//����֪�������ˣ��Ҳ�������Ĵ����Ѿ���n�ı����0��
		 sc.close();
		 
	 }
	 public static  double f(int n){
	   double m;
		 if (n==0) return 1;
		 else m = n*f(n/2);
		 return m;
		 
		 //     if (n==0)   return 1;
		//      else           return= n*f(n/2);//������ˣ���������βε�һЩ����
		 
		 
	 }
}
