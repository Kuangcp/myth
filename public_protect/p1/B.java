package p1;
/**
 * 除了private不能访问
 * @TODO 
 * @author  Myth
 * @date 2016年10月20日 下午3:42:28
 */
public class B {

	public static void main(String[] args){
		A jk = new A();
		System.out.println(jk.v1);
		System.out.println(jk.v2);
		System.out.println(jk.v3);
//		System.out.println(jk.v4);
	}
	
	
}
