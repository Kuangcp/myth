package Hash;

import java.util.Hashtable;
/*
 * hashmap 是线程不安全的  允许
 * hashtable是线程安全的   不允许空值
 */


public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable  ht =new Hashtable();
		
		
		//ht.put("ss003", emp);  这个是和hashMap用法一样的
		ht.put(null,null);//运行就报错
		System.out.println("测试"+ht.get(null));

	}

}
