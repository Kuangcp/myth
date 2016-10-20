package Demo_CI;

public class Pci_1 { //主类和接口 编译的class文件同名了    windows不区分大小写
	public static void main(String[] a){
		MainBoard mb = new MainBoard();
		
		mb.usePCI(new NetCard());
		mb.usePCI(new SoundCard());
		mb.run();
		mb.close();
	}

}
