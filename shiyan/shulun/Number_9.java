package shulun;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 假设 两位数ab 打乱后是ba 那么作差  假设a>b那么结果的位的和就是：
 * 	a-1-b  +  b-a+10   =   9
 * 同理可证3,4,5。。。位的数字
 * @author  Myth
 * @date 2016年9月10日 上午8:08:59
 * @TODO 任意整数打乱顺序后两个数作差，取绝对值，各位想加，两位数再各位相加最终结果一定是9
 */
public class Number_9 {

	int CLC = 10;
	public static void main(String[] args) {
		Number_9 f = new Number_9();
		f.run();
	}
	private void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意正整数");
		BigInteger num = sc.nextBigInteger();
		if(sc!=null)sc.close();
		long input = num.longValue();
		
//		long ran = getNum(input);
//		System.out.println("和："+reduce(ran, input));
		for(int i=0;i<CLC;i++){
			System.out.println("两数求和 : "+reduce(input,getNum(input)));
		}
	}
	private int reduce(long num1,long num2){
		long result=0;
		if(num1>num2)
			result = num1-num2;
		else result = num2-num1;
		System.out.println("差："+result+"   除九 ： "+result/9);
		int add=0;
		while(result!=0){
			add+=(result%10);
			result/=10;
		}
		if(add>9){
			int temp = add;
			add = temp%10;
			temp/=10;
			add+=temp%10;
		}
		return add;
	}
	private long getNum(long num){
		List<String>nums = new ArrayList<String>();
		while(num!=0){
			nums.add(num%10+"");
			num/=10;
		}
		String num2="";
		while(nums.size()!=0){
			int index = (int) (Math.random()*nums.size());
			num2+=(nums.get(index)+"");
			nums.remove(index);
		}
		System.out.print("随机："+num2+"      ");
		if(num2.length()>10){
			System.out.println("数值过大，数据溢出");
			return 0;
		}
		long result = Integer.parseInt(num2);
		return result;
	}
}
