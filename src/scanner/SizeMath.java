package scanner;
import java.util.Scanner;
public class SizeMath {
	public static void main (String[] args){
		Scanner pp = new Scanner(System.in);
		
	    System.out.println("������һ��������");
	    int num1 = pp.nextInt();
	    System.out.println("��������һ��������");
	    int num2 = pp.nextInt();
	    pp.close();
	    if (num2>num1&&num2>2){
	    	System.out.println("num2>num1&&num2>2");
	    }
	    if (num2>num1||num2==num1){
	    	System.out.println("num2>num1&&num1==num2");
	    }
	    if (!(num2>num1)){
	    	System.out.println("num2<=num1");
	    }
	}

}
