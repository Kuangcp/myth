package ShiTan;
/**
 * System.arraycopy() Դ���飬Դ������ʼλ�ã�Ŀ�����飬Ŀ��������ʼλ�ã�Ҫ��Դ���鸴�Ƶĳ���
 * @author lenovo
 *
 */
public class copy {
	public copy(){
		System.out.println(this);//�������.����+��ϣ��ַ
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
