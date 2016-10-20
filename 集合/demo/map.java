package demo;

import java.util.*;
import java.util.Map.Entry;



public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer Ҳ�������Զ�������� ���� ���ϣ��༶��ѧ���ϣ���
		java.util.Map<String,Integer> SI = (Map<String, Integer>) new HashMap<String,Integer>();
		((HashMap<String, Integer>) SI).entrySet();
		
		((HashMap<String, Integer>) SI).get("jj");//��Ϊû��������һ��null
		
		for (Entry<String, Integer> entry :((HashMap<String, Integer>) SI).entrySet()){
			entry.getKey();
			entry.getValue();
		}
	}

}
