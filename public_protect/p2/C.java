package p2;

import p1.A;
/*
 * 不同包的访问 只能访问public
 */
public class C {

	public static void main(String[] args){
		A jk = new A();
		System.out.println(jk.v1);
		// System.out.println(jk.v2);
		// System.out.println(jk.v3);
		// System.out.println(jk.v4);
	}
}
