package Hash;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashmap_ {

	public static void main(String[] args) {
		
		HashSet u= new HashSet(); // 以哈希码为标示，可以去除重复的情况  序列的顺序是依据哈希值来排列的（不是按插入的先后） 能保证对象唯一
		/*u.add(hj);
		u.add(hj);  
		*/  //只要这两个指向是同一个对象，就不会有两个存在
		/*public int Hashcode (){
			return 0;  重写方法
		}*/
		
	/*	
	 * 迭代器  链表的遍历
	 * iterator<student> it = student.iterator();
		student stu;
		while (it.hashNext()){
			stu  = it.next();
		}*/
		
		
		// TODO Auto-generated method stub
		//创建一个哈希map
		HashMap hm = new HashMap();
		Emp emp1  =new Emp("1","纳兹",56.5f);
		Emp emp2 =new Emp("2","哈比",6.5f);
		Emp emp3 =new Emp("3","doubi ",63.5f);
		
		//将emp放入发到hm
		hm.put("s001", emp1);
		hm.put("s002", emp2);
		hm.put("s003", emp3);//如果键值是s002这样的情况就是后面的替换前面的，保证键值唯一
		
		//如果要查找编号是s002
	    if (hm.containsKey("s002")){
	    	System.out.println("有该员工");
	    	//如何取出键<-->值
	    	Emp emp =(Emp)hm.get("s002");
	    	System.out.println("名字是："+emp.getName());
	    }
	    else{
	    	System.out.println("没有该员工");
	    }
	    
	    //遍历hashmap的key和value  这个遍历的结果是无序的
	    //Iterator  迭代法
	    java.util.Iterator it = hm.keySet().iterator();
	    //hashNext返回一个boolean
	    while (it.hasNext()){
	    	//取出key
	    	String key = it.next().toString();
	    	//通过key取出value
	    	Emp emp = (Emp)hm.get(key);
	    	System.out.println("名字是："+emp.getName());
	    	System.out.println("薪水是："+emp.getSal());
	    }
	}

}
