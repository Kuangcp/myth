package Hash;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashmap_ {

	public static void main(String[] args) {
		
		HashSet u= new HashSet(); // �Թ�ϣ��Ϊ��ʾ������ȥ���ظ������  ���е�˳�������ݹ�ϣֵ�����еģ����ǰ�������Ⱥ� �ܱ�֤����Ψһ
		/*u.add(hj);
		u.add(hj);  
		*/  //ֻҪ������ָ����ͬһ�����󣬾Ͳ�������������
		/*public int Hashcode (){
			return 0;  ��д����
		}*/
		
	/*	
	 * ������  ����ı���
	 * iterator<student> it = student.iterator();
		student stu;
		while (it.hashNext()){
			stu  = it.next();
		}*/
		
		
		// TODO Auto-generated method stub
		//����һ����ϣmap
		HashMap hm = new HashMap();
		Emp emp1  =new Emp("1","����",56.5f);
		Emp emp2 =new Emp("2","����",6.5f);
		Emp emp3 =new Emp("3","doubi ",63.5f);
		
		//��emp���뷢��hm
		hm.put("s001", emp1);
		hm.put("s002", emp2);
		hm.put("s003", emp3);//�����ֵ��s002������������Ǻ�����滻ǰ��ģ���֤��ֵΨһ
		
		//���Ҫ���ұ����s002
	    if (hm.containsKey("s002")){
	    	System.out.println("�и�Ա��");
	    	//���ȡ����<-->ֵ
	    	Emp emp =(Emp)hm.get("s002");
	    	System.out.println("�����ǣ�"+emp.getName());
	    }
	    else{
	    	System.out.println("û�и�Ա��");
	    }
	    
	    //����hashmap��key��value  ��������Ľ���������
	    //Iterator  ������
	    java.util.Iterator it = hm.keySet().iterator();
	    //hashNext����һ��boolean
	    while (it.hasNext()){
	    	//ȡ��key
	    	String key = it.next().toString();
	    	//ͨ��keyȡ��value
	    	Emp emp = (Emp)hm.get(key);
	    	System.out.println("�����ǣ�"+emp.getName());
	    	System.out.println("нˮ�ǣ�"+emp.getSal());
	    }
	}

}
