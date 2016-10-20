package sort;

import java.util.Date;
/**
 * 得到的都是毫秒
 * Date 就是getTime方法 
 * calendar 就是getTimeInMillis方法
 * @author lenovo
 *
 */
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date beginTime = new Date();
		Date endTime = new Date();
		long between = endTime.getTime() - beginTime.getTime();
		//计算时间差（单位为毫秒），getTime（）函数为Date类获取记录时间的毫秒时间
		
	}

}
