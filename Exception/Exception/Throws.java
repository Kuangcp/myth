package Exception;
//有catch就会下一步
public class Throws {

	public static void main(String [] s) throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("捕获到");
			// TODO: handle exception
		}
		System.out.println("继续运行");
	}
}
