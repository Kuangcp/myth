package String;

public class String_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] k = new int[3][4];
		System.out.println(k.length);//����ͷ��϶�άָ��ĸ����ά������������length����ȫ���еĸ�����k[0]���ǵ�һ�еĳ���
		
//		String s = "123  456 4 ";
//		System.out.println(StoInt(s)+1);
//		System.out.println("0-1."+s.substring(0,6));//SubString������0-6 �ǣ�0,6]������
		
	}
	/**��Stringת����int�����3λ����ֻ��ȡ�ַ������ұߵ�һ�����ֿ�ʼ����ߵ�һ���ո������ȡ
	 * ���磺" 123 4 5   "---> 5  
	 * */
	public static  int StoInt(String s){
		int I=0;
		int bit;
		bit = 1;
		for(int i=0;i<s.length();i++){
//			System.out.println(s.length()-i-1);
			if(s.charAt(s.length()-i-1)!=' '){
			    I+= (s.charAt(s.length()-i-1)-48)*bit;
			    bit*=10;
			}else if (bit == 1){
				continue;
			}else{
				break;
			}
			
		}
		return I;
	}

}
