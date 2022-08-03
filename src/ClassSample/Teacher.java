package week5.patikadev.java101.clss;

public class Teacher {
	String name,branch;
	int mpno;
	
	public Teacher(String name, String branch, int mpno) {
		super();
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getMpno() {
		return this.mpno;
	}

	public void setMpno(int mpno) {
		this.mpno = mpno;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + this.name + ", branch=" + this.branch + ", mpno=" + this.mpno + "]";
	}
	
}
