package ShiTan;
/**
 * System.arraycopy() 源数组，源数组起始位置，目的数组，目的数组起始位置，要从源数组复制的长度
 * @author lenovo
 *
 */
public class copy {
	public copy(){
		System.out.println(this);//输出包名.类名+哈希地址
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g="jj";
		g+=100;
		System.out.println(g.length());
		/*copy h =new copy();
		new copy();
		new copy();
		int a[] = {4,5,6,7,8};
		int b[] = new int [8];
		System.arraycopy(a,0,b,0,5);
		for(int i=0;i<a.length;i++)
		System.out.println(b[i]);*/
	}

}
