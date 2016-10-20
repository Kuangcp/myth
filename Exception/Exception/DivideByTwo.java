package Exception;
import java.util.Scanner;
/*
  Enter an integer:
  hkl
  java.lang.NumberFormatException: For input string: "hkl"
    因为违法了，不是整型，所以就抛出异常

 */
public class DivideByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("Enter an integer:");
		try
		{
			String oneLine = in.nextLine();
			x = Integer.parseInt(oneLine);
			System.out.println("Half of X is "+(x/2));
		}
		catch (NumberFormatException e)
		{System.out.println(e);}
        in.close();
	}

}
