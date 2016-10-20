package Hash;

public class Emp{
	private String empNo;
	private String name;
	private float sal;
	
	public Emp(String empNo,String name,float sal){//¹¹ÔìÆ÷
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
	}
	
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
}