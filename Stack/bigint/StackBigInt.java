package bigint;

import java.util.*;
import stacks.LinkStack;
/*
 * ջ��ʵ�ִ��������      ����� ����
 * û�취��ֻ����д������
 */
public class StackBigInt extends LinkStack{
	public static void main(String[] args) {
		String a,b; int flag=0;
		
		LinkStack SA = new LinkStack();
		LinkStack SB = new LinkStack();
		LinkStack SC = new LinkStack();
		
		System.out.println("������������������������λ������");
		Scanner s = new Scanner(System.in);
		a = s.nextLine();
		b = s.nextLine();
		s.close();
		
		int i=0;
		while(i<a.length()){
			SA.push(a.charAt(i));//sharAt�ŵ����±�ֵ
			//System.out.println(a.charAt(i));
			i++;
		}
		i=0;
		while(i<b.length()){
			SB.push(b.charAt(i));
			//System.out.println(b.charAt(i));
			i++;
		}
		while(!SA.isEmpty() && !SB.isEmpty()){
			int sum;
			sum = SA.pop()+SB.pop()+flag-96;flag = 0;
			if (sum>=10) { sum-=10;flag = 1;}
			SC.push(sum);
		}
		if (!SA.isEmpty() && SB.isEmpty()){
			while (!SA.isEmpty()){
				int t = SA.pop()+flag-48;flag=0;
				if (t>=10) { t-=10;flag = 1;}
				SC.push(t);
			}
		}
		else if (SA.isEmpty() && !SB.isEmpty()){
			while (!SB.isEmpty()){
				int t = SB.pop()+flag-48;flag=0;
				if (t>=10) { t-=10;flag = 1;}
				SC.push(t);
			}
		}
		if (flag == 1)   SC.push(flag);
		System.out.println("�����������ĺ��ǣ�");
		SC.display();//�����Ľ��˳��պ������ֵ�˳��
		

	}

}
