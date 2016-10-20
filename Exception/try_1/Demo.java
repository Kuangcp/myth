package try_1;
//  除法运算
public class Demo {
	int div (int a,int b) throws FushuException{ //抛出异常是抛给调用者 
		if (b<0){FushuException F = new FushuException("除数为负",b);
			throw F;
		}
		//这里要抛出异常 那个测试函数才能try 抓获到异常  
		//否则就会说try子块中没有异常可以捕获而报错	
		return a/b;
	}
}
