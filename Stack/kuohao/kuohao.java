package kuohao;

import stacks.LinkStack;
import stacks.Node;
/* Ҫ��ƥ���������ʽ�����ţ���ָ����������ͺͱ���������һ����
 * ��ֻ�������˼�����ţ������жϱ��ʽ�����Ƿ���ȷ�����򵥵ĺ��أ�������һ�����ϣ����ͣ���
 * ����ķ������س������ˣ������Ժ�����
 */
import java.util.*;
public class kuohao extends LinkStack{
	
	public static void main (String [] args){
		LinkStack S = new LinkStack ();
		int flag = 1;
		System.out.println("java");
		Scanner I = new Scanner(System.in);
		String buffer = I.nextLine();
		System.out.println("��������ǣ�"+buffer);
		I.close();
		
		for  (int k=0 ;k<buffer.length();k++){
			switch((char)(buffer.charAt(k))){
			case '(':S.push((char)(buffer.charAt(k)));break;
			case '{':S.push((char)(buffer.charAt(k)));break;
			case '[':S.push((char)(buffer.charAt(k)));break;
			case ')':
				if (S.found('('))  S.pop();
				else {System.out.println("��������ţ���");flag=0;}break;
			case ']':
				if (S.found('['))  S.pop();
				else {System.out.println("��������ţ�]");flag=0;}break;
			case '}':
				if (S.found('{'))  S.pop();
				else {System.out.println("��������ţ�}");flag=0;}break;
			default :break;
			}
			//S.push((char)(buffer.charAt(k)));
		}
		
		
		if(!S.isEmpty()){
			
			while(!S.isEmpty()){
				flag=0;
				switch (S.pop()){
				case '(':System.out.println("��������ţ�(");break;
				case '{':System.out.println("��������ţ�{");break;
				case '[':System.out.println("��������ţ�[");break;
				default:System.out.println("ʲô���㾹Ȼ�ܿ�����仰");break;
				}	
			}
		}
		//System.out.println(flag);
		//����һ�д������ڵ��Եĸ���ԭ���������������ֻ���ǵ�����������Ŷ������������ǰ���Ǹ�������
		if (flag == 1) System.out.println("�������ʽ����ƥ��ɹ�����");
		
		//��Ϊ������д��ʧ�ܣ�����д�˼��д��룬����display������������
		Node p = S.top;
		while(p!=null){
			System.out.print((char)p.data);
			p = p.next;
		}
		 
	}
	/*public void display(){
	Node p = this.top;
		while(p!=null){
			System.out.print((char)p.data);
			p = p.next;
		}//Ϊʲô��������ʧ�ܣ���������������������������������
	}*/
}

