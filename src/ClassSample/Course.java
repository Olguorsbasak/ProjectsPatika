package week5.patikadev.java101.clss;

public class Course {
	String name,prefix;
	int code,note;
	Teacher teacher;
	

	public Course(String name, String prefix, int code, int note, Teacher teacher) {
		super();
		this.name = name;
		this.prefix = prefix;
		this.code = code;
		this.note = note;
		this.teacher = teacher;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrefix() {
		return this.prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getCode() {
		return this.code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getNote() {
		return this.note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Teacher getTeacher() {
		return this.teacher;
	}	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	
	}
	public void  addTeacher() {
		
	}
	public void printTeacher() {
		
	}
	
	@Override
	public String toString() {
		return "Course [name=" + this.name + ", prefix=" + this.prefix + ", code=" + this.code + ", note=" + this.note
				+ ", teacher=" + this.teacher + "]";
	}
	
	
	
}
