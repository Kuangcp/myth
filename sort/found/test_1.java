package found;


import sort.Insert;

public class test_1 {
	public static void main (String []args){
		Insert insert = new Insert();
		ErFenFa s = new ErFenFa();
		
		int [] dat = new int [5000];
		for (int i=0;i<dat.length;i++){
			dat[i] =(int)(Math.random()*90000+10);}
        insert.sort(dat);
        
        for (int i =0;i<dat.length;i++) {  //���������һ��
			System.out.print(dat[i]+" ");
			if ((i+1)%10 == 0) System.out.println();
        }
		System.out.println();
		
		int result = s.find(dat, 58);
		if (result!=-1)
		System.out.println("��Ҫ�ҵ������ڵ�"+result+"��λ��");
		else System.out.println("�����ݲ����ڣ�����ʧ�ܣ�");
		
	}

}
