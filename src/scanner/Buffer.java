package scanner;
/*
 * ��������buffer�������� ������Scanner
 * float ֻ��7λС��
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) {

		float [] fens = new float[8];
		InputStreamReader isr  = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for (int i=0;i<fens.length;i++){
			System.out.println("�������"+(i+1)+"�����еĳɼ�");
			try {
				fens[i] = Float.parseFloat(br.readLine());
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		for (int i=0;i<fens.length;i++){
			System.out.print(fens[i]+" ");
		}

	}

}
