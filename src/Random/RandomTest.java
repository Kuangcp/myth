package Random;

public class RandomTest {

	public static void main(String [] s){
		for(int i=0;i<8;i++){
			System.out.println((int)(Math.random()*96)%4);
		}
	}
}
