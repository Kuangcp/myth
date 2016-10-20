package Demo_CI;

import java.util.ArrayList;
import java.util.List;

interface PCI{
	public void open();
	public void close();
}
class MainBoard{
	private List<PCI>pcis = new ArrayList<PCI>();
	

	
	public void run(){
		System.out.println("mainboard run");
		for(PCI p:pcis){//  foreachѭ��  ��ʱ����p �Ӽ���pcis�б���   ע��ֻ��ȡ�ü���Ԫ�ص�ֵ�ĸ�������p�ĸ��Ĳ�����Ӧ�õ���������
			p.open();
		}
	}
	public void close(){
			System.out.println("mainboard close");
			for (PCI p:pcis){
				p.close();
			}
		}
	
	@SuppressWarnings("null")
	public void usePCI(PCI p){
		if (p==null){
			pcis.add(p);
			System.out.println("mainboard ���� "+p.getClass().getName());
			//     p.getClass().getName()    ����
		}
	}
}
class NetCard implements PCI{

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("netCard open");
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("netCard close");
	}
	
}
class SoundCard implements PCI{

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("SoundCard open");
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("SoundCard close");
	}
	
}
