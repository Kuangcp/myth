package try_1;
/*
 * �쳣Ҳ��һ���� �����Զ���һ��һ�쳣 ֻҪ�̳���Exception�Ϳ�����
 * ��Ҳ�й��캯�� ��������ʼ���쳣��Ϣ
 */
public class FushuException extends Exception{
	private int value;
	FushuException(){
		super();
	}
	FushuException (String msg,int value){
		super(msg);
		this.value = value;
	}
	public int getvalue(){
		return value;
	}

}
