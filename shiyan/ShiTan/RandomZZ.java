/**
 * 产生随时间变化的随机数后的对16取余，转换成16进制的字符
 * 
 * 实验
 */
package ShiTan;

public class RandomZZ {

	public static void main(String[] args) {

		double j= Math.random();//得到一个好长的数，但是double只能放下16位
		System.out.println(j);
		for (int i=0;i<27;i++){
			
			int  a =(int) (j*10);
			j*=10;
			j-=a;
		    System.out.println(" "+i+" "+a);
		}
		
		
	}

}
