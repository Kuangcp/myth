package ShiTan;
/**
 * ��ȡ����ʱ���� ��״̬
 * @author lenovo
 *
 */
public class runtimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime();
		System.out.println("����������:"+rt.availableProcessors());
		System.out.println("�����ڴ���:"+rt.freeMemory());
		System.out.println("���ڴ���:"+rt.totalMemory());
		System.out.println("�����ڴ���:"+rt.maxMemory());
	}

}
