package worker9;

public class Student {
	/**
	 * 学号
	 */
	private String stuNo;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 性别
	 */
	private char sex;
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Student() {
		super(); 
	}
	public Student(String stuNo, String name, int age, char sex) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [学号=" + stuNo + ",姓名=" + name + ", 年龄=" + age + ",性别="+sex+"]";
	}
	
}
