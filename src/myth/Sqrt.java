package myth;

/**
 * 这是一种计算方式来开平方根
		1、先减去整数部分，将余数乘以100，
		2、再进行试探下一位小数，
			试探数 * （20倍当前精度的计算结果加上那个试探数）<100*余数 
		3、取试探数的最大值，将这位小数确定下来，再重复1，2试探操作，
	基本是一种从左边循循逼近真实值的计算方法
 * @author  Myth
 * @date 2016年10月9日 下午8:52:27
 * @TODO
 */
public class Sqrt {
	public static void main(String []a){
		
	}
}
