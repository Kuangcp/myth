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
		for(PCI p:pcis){//  foreach循环  临时变量p 从集合pcis中遍历   注意只是取得集合元素的值的副本，对p的更改并不会应用到集合里面
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
			System.out.println("mainboard 插入 "+p.getClass().getName());
			//     p.getClass().getName()    ？？
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
