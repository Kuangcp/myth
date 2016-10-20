package main;

import java.util.ArrayList;
import java.util.List;

/*
 * 集合对象 ： 一大类是数组集合号  List 、Set
 *          Map集合
 */
public class JiHe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                           //  类型转换：
				String valu = "123";
				int h = 12;
				int s = Integer.parseInt(valu);
				Integer y = new Integer(12);
				h = y+30;  //自动拆箱和装箱
				boolean a = true ;
				Boolean b  = new Boolean(a);
				
				
		List L = new ArrayList(2);
		L.add(78);
		L.add(8);

	}

}
