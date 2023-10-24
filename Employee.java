package task10;

public class Employee {
	
	int id,osal;
	double upsalary;
	String name,fname,lname;
	public int getid() {
		return id;
	}
	public String getfname() {
		return fname;
		}
	public String getlname() {
		return lname;
		}
	public String getname() {
		name=fname+lname;
		return name;
	}
	public double getsal() {
		return osal;
	}
	
	public void setid(int id) {
		this.id=id;
		
	}
	public void setfname(String fname) {
		this.fname=fname;
		}
	public void setlname(String lname) {
		this.lname=lname;
		}
	public void setname() {
		this.name=this.fname+this.lname;
		}
	public void setsal(int sal) {
		this.osal=sal;
	}
	
	public void raisesalary(double percent) {
		 double raiseAmount = osal * percent / 100;
	        upsalary = raiseAmount+osal;
	}
	public double getupdatedsal(double sal) {
		return upsalary;
		
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setid(10);
		e.setfname("Dinesh");
		e.setlname("Raja");
		e.setsal(5000);
		e.raisesalary(10);
		
		int eid=e.getid();
		String ename=e.getname();
		double esal=e.getsal();
		double s=e.getupdatedsal(0);
		
		System.out.println(eid+" : "+ename+" : "+ esal+" : "+s);
		
		

	}

}
