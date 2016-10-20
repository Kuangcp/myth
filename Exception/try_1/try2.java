package try_1;
/*
   NO SUCH FILE FOUBD
   Doing Finally
   -1
   在离开try 或者 catch 块之前执行finally
   
   如果finally有return 就是finally  <没有就是catch里最后一个为准>? 两个return 后面的不就是死亡代码么，，，
*/
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 

public class try2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try2 u = new try2();
		System.out.println(u.method());
	}
	public int method(){
		int i =-1;
		try {
			FileInputStream Fi = new FileInputStream("hj.kl");
		}catch (FileNotFoundException H){
			System.out.println("NO SUCH FILE FOUND");
			 i++;  //显然是会体现在finally里
			return i;
			/* 死亡代码
			 * i++;
			return i;*/
			//return -1;  
			// 这里是函数的终结，要在finally后执行，如果先执行了return  就不会留机会给finally回收资源了
			// 如果catch块里手动抛出异常 也要先执行finally再抛出
			// 在离开try 或者 catch 块之前执行finally
		}catch (IOException jk){
		}finally{
			++i;   //怎么没有得到执行？  得到了执行，但是好像是不同的栈的i
			System.out.println(i);//这里输出是 0 显然的得到了执行 为什么catch里的return 就没有变呢。。
			System.out.println("Doing Finally");
			return i;// 这里就是0 两个return以finally的为准，并且值也是finally的
		}
		//如果finally里有return语句 下面的语句就unreachable code 不可到达代码（死亡代码）
		//return 0; // 如果放在finally 里结果就是0 因为finally的return会先一步catch里的return语句
	}

}
