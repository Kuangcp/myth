package demo;
/* ArrayList �� Vector ���
 * ArrayList ���첽��
 * Vector��ͬ����  ͬ���ķ���Դ����Ч�ʵ��ǰ�ȫ
 * 
 * ArrayList���Զ�����50%
 * Vector���Զ�����һ��
 */
import java.util.Vector;

public class Vector_ {
	public static void main (String [] args){
		Vector vv = new Vector();
		Emp emp = new Emp("kl","j",1.2f);
		vv.add(emp);
		for (int i=0;i<vv.size();i++){
			Emp emp2 = (Emp)vv.get(i);
		}
	}
}

/*
 * 1 ���Ҫ���̰߳�ȫ��ʹ��Vector��Hashtable
 * 2 ���Ҫ���̰߳�ȫ��ʹ��ArrayList��LinkedList��HashMap
 * 3 ���Ҫ���ֵʱ����ʹ��HashMap��Hashtable
 * 4 ���������ô���Ҫ�̰߳�ȫ �Ϳ���Vector
 */
