/**
 * ������ʱ��仯���������Ķ�16ȡ�࣬ת����16���Ƶ��ַ�
 * 
 * ʵ��
 */
package ShiTan;

public class RandomZZ {

	public static void main(String[] args) {

		double j= Math.random();//�õ�һ���ó�����������doubleֻ�ܷ���16λ
		System.out.println(j);
		for (int i=0;i<27;i++){
			
			int  a =(int) (j*10);
			j*=10;
			j-=a;
		    System.out.println(" "+i+" "+a);
		}
		
		
	}

}
