package jiekou;
/* �ӿڵļ̳У�
 * ����ʵ���������ӿڣ�����������Printer�����Output����Product�����࣬�����Java�ṩ��ģ���̳�
 * Printerʵ���������ӿڣ����ɻ�ȡ�ӿ��е�Ĭ�Ϸ��������Printerʵ��Ҳ���Ե��ýӿڵ�Ĭ�Ϸ���
 * 
 */
interface Product{
	int getProduceTime();
}
public class Printer implements Output,Product{
	private String [] printData = new String[MAX_CACHE];//ֱ��ʹ�ýӿڵı���
	private int dataNum = 0;
	public void out (){
		//ֻҪ������ҵ���ͼ�����ӡ
		while (dataNum > 0){
			System.out.println("��ӡ����ӡ��"+printData[0]);
			System.arraycopy(printData,1,printData,0,--dataNum);//����ҵ��������ǰ����Ϊ������ʣ�µ���ҵ����һ
		}
	}
	public void getData(String msg){
		if (dataNum >= MAX_CACHE){
			System.out.println("����������������ʧ�ܣ�");
		}
		else 
		{
			//�Ѵ�ӡ������ӵ�������ѱ����������һ
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime(){
		return 45;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��Printer���󣬵���Outputʹ�ã���̬��
		Output o = new Printer();
		o.getData("������Java EE��ҵӦ��ʵս");
		o.out();
		o.getData("���Java����");
		o.out();
		//����Output�ӿ��ж����Ĭ�Ϸ���
		o.print("�����","��˽�","�׹Ǿ�");
		o.test();
		
		//o.staticTest();This static method of interface Output can only be accessed as Output.staticTest
		//System.out.println(Output.staticTest());
		//����һ��Printer���󣬵���Product������ʹ�ã���̬��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ���������ֱ�Ӹ�ֵ��Object���͵ı���
		Object opj = p;
	}
	public void print(String... msqs) {
		// TODO Auto-generated method stub
		
	}
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
