package scanner;
/*
 * 这里是用buffer流来输入 而不是Scanner
 * float 只有7位小数
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) {

		float [] fens = new float[8];
		InputStreamReader isr  = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for (int i=0;i<fens.length;i++){
			System.out.println("请输入第"+(i+1)+"个裁判的成绩");
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
