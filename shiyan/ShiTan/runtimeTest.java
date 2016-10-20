package ShiTan;
/**
 * 获取运行时环境 的状态
 * @author lenovo
 *
 */
public class runtimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime();
		System.out.println("处理器数量:"+rt.availableProcessors());
		System.out.println("空闲内存数:"+rt.freeMemory());
		System.out.println("总内存数:"+rt.totalMemory());
		System.out.println("可用内存数:"+rt.maxMemory());
	}

}
