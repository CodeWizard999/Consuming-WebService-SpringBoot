package ca.sheridancollege.imranfi.bean;

public class Student {
	
private int id;
private  String name;
private int grade; 
private String letterGrade;
public Student(int id, String name, int grade, String letterGrade) {
	super();
	this.id = id;
	this.name = name;
	this.grade = grade;
	this.letterGrade = letterGrade;
}
public Student() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public String getLetterGrade() {
	return letterGrade;
}
public void setLetterGrade(String letterGrade) {
	this.letterGrade = letterGrade;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", letterGrade=" + letterGrade + "]";
}



}
