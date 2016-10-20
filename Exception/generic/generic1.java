package generic;
//使用泛型就要必须要用 JRE 1.5  换编译等级1.6也跑不过
/*
 * 《1》 类型安全
 * 《2》 向后兼容
 * 《3》层次清晰
 * 《4》性能较高
 */
import java.util.ArrayList;

class dog {
	private String name = "dog";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class cat {
	private String name = "cat";
}
public class generic1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<dog> a = new ArrayList<dog>();//泛型是前后的都要加尖括号
		//创建一只狗
		dog dog1 = new dog();
		a.add(dog1);
		//a.add(new cat());  这个就会报错
		dog t =  a.get(0);  // 无须强转
		
		System.out.println(t.getName());
		//cat tt = (cat)a.get(0);//报错： java.lang.ClassCastException:
		


	}

}
