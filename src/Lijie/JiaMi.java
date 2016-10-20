package Lijie;

public class JiaMi {

//	    加密函数
	public static void f(String d,char[]s){
		for(int i=0;i<d.length();i++)
		s[i] = (char) (d.charAt(i)+5);
		
	}
//		解密函数
	public static void g(char[] d,char[]s){
		for(int i=0;i<s.length;i++)
			d[i] = (char) (s[i]-5);
	}
		
	public static void main(String[] args) {

//		String a1="Dear Li Jie, it's always been a happy time";
		String a1="Please wait five seconds.";
		String b1="Luck is always with you.";
		char []d = new char[a1.length()];
		char []e = new char[b1.length()];
				
		f(a1,d);
	    f(b1,e);
		System.out.println(a1);
		System.out.println(b1);
		System.out.print("加密后的a:  ");
		for (int i=0;i<d.length;i++)
		System.out.print(d[i]);
		System.out.print("\n加密后的b:  ");
		for (int i=0;i<e.length;i++)
			System.out.print(e[i]);
//	   解密
		System.out.print("\n解密后a： ");
		char []as = new char[a1.length()];
		char []bs = new char[b1.length()];
		g(as,d);
		g(bs,e);
		for (int i=0;i<as.length;i++)
			System.out.print(as[i]);
		System.out.print("\n解密后b：  ");
		for (int i=0;i<bs.length;i++)
			System.out.print(bs[i]);
		System.out.println();
	}

}
