package String;

public class String_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] k = new int[3][4];
		System.out.println(k.length);//这里就符合二维指针的概念，二维数组数组名的length就是全部行的个数，k[0]就是第一行的长度
		
//		String s = "123  456 4 ";
//		System.out.println(StoInt(s)+1);
//		System.out.println("0-1."+s.substring(0,6));//SubString参数：0-6 是（0,6]的区间
		
	}
	/**将String转换成int（最大3位数）只读取字符串从右边第一个数字开始到左边第一个空格结束读取
	 * 例如：" 123 4 5   "---> 5  
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
