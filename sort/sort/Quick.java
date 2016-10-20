package sort;

public class Quick {
	//��������һ�ѵ������±�Խ��
	
	 void quick (int []Q,int left,int right)
	{
		int left_x=left;
		int right_x=right;
		int pivot=Q[(left+right)/2];
		while (left_x<=right_x)
		{
			for(;Q[left_x]<pivot;left_x++);//����߿�ʼ����
			for(;Q[right_x]>pivot;right_x--);//���ұ߿�ʼ����
			if (left_x<=right_x)//ִ�н���
			{
				if (left_x!=right_x) {int temp = Q[left_x];Q[right_x]=Q[left_x];Q[right_x]=temp;}
					//SWAP(Q[left_x],Q[right_x]);//��ôʵ�ֽ���
				left_x++;right_x--;	
			}
		}
		if (right_x>left)//�����ĵݹ����
		{
			quick(Q,left,right_x);
		}
		if (left_x<right)//�����ĵݹ����
		{
			quick(Q,left_x,right);
		}
	}
	void quick_all(int []Q,int data_size)//���ȫ�֣��ٴεݹ����
	{
		quick(Q,0,data_size-1);
	}
	public void sort(int[]arr){
		quick(arr,0,arr.length-2);          //ָ��λ�ý�������
		quick_all(arr,arr.length-1);        //ֻ���һ��͹��ˣ�
	}
	/*public static void main(String [] args)
	{
		int data[7],i;
		    for (i=0;i<7;i++)
			{
				printf("��������");
				scanf("%d",&data[i]);
			}
		quick(data,0,6);//ָ��λ�ý�������
		quick_all(data,7);//ֻ���һ��͹��ˣ�
		for (i=0;i<7;i++)
			printf ("%2d\n",data[i]);
	}
	//����û����ԭ���Ѿ������*/

}
