package Abstract1;
/*
 * ���������Žӿ����Ƶ����ʣ�����ȴ����ӵ�нӿ���û�е���ͨ��Ա����֮���һ�㣬
 * ��������Ŀǰ��ˮƽ��û�õ�Ӧ��
 */
abstract class MineBase{
	abstract void method();
	static int i;
}
public abstract class abs extends MineBase{
	//�̳�һ�������࣬������д���󷽷��ģ���������û�У���Ȼ�б���������������ǻ��������
   //  ����������Ҳע���ǳ����࣬�Ͳ�����дmethod������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] s = new int [5];
		 for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}

	}

	

}
