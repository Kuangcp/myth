package Demo_CI;

public class Pci_1 { //����ͽӿ� �����class�ļ�ͬ����    windows�����ִ�Сд
	public static void main(String[] a){
		MainBoard mb = new MainBoard();
		
		mb.usePCI(new NetCard());
		mb.usePCI(new SoundCard());
		mb.run();
		mb.close();
	}

}
