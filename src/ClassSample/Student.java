package week5.patikadev.java101.clss;

public class Student {
	String name;
	int StudentNo,classes;
	double  average;
	boolean isPass;
	Course math;
	Course chemy;
	Course music;
	
	public Student(String name, int studentNo, int classes, double average, boolean isPass, Course math, Course chemy,
			Course music) {
		super();
		this.name = name;
		this.StudentNo = studentNo;
		this.classes = classes;
		this.average = average;
		this.isPass = isPass;
		this.math = math;
		this.chemy = chemy;
		this.music = music;
	}
	public void addBulkExamNote() {
		
	}
	public void isPass () {
		
	}
	public void calcAverage() {
		
	}
	public void printNote() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + this.name + ", StudentNo=" + this.StudentNo + ", classes=" + this.classes
				+ ", average=" + this.average + ", isPass=" + this.isPass + ", math=" + this.math + ", chemy="
				+ this.chemy + ", music=" + this.music + "]";
	}
	
	
	
}
