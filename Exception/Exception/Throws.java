package Exception;
//��catch�ͻ���һ��
public class Throws {

	public static void main(String [] s) throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("����");
			// TODO: handle exception
		}
		System.out.println("��������");
	}
}
