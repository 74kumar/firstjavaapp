
public class Emp implements Comparable<Emp>
{
	private int eid;
	private String ename;
	private double sal;
	
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}


	@Override
	public int compareTo(Emp o) {
		
		return this.eid-o.eid;
	}
	
	
	
	

}
