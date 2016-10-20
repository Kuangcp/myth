package ShiTan;

/**
 * 验证类的成员和对象的成员的地址区别
 */

class tex{
	int[] a = new int[3];
	static int[] b = new int [2];
}
public class variable {

	public static void main(String[] args) {
		Integer a = Integer.parseInt("12");
		Integer b = Integer.valueOf("12").intValue();
		System.out.println(a.equals(b));
//		tex t = new tex();
//		tex t2 = new tex();
//		
//		System.out.println(t.a);
//		System.out.println(t2.a);
//		System.out.println(t2.b);
//		System.out.println(t.b);
		System.out.println(-10%-3);
	}

}
