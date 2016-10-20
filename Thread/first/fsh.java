package first;

public class fsh extends Thread{


	private num n;
	public void setNum(num n){
		this.n = n;
	}
	
	//重写  线程运行的主方法
	public void run (){
		n.disp();
	}
}
