package jihe;

public class Worker {
	private int age;
	private String name;
	private double salary;
	public Worker (){}
	public Worker (String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void work(){
		System.out.println(name + "work");
	}
	@Override
	public boolean equals(Object obj) {
		Worker other = (Worker) obj;
		if(name.equals(other.name)&&age==other.age&&salary==other.salary) {
			return true;
		}
	return false;
	}
	
	
	@Override
	public String toString() {
		return "jihe [name=" + name + "\t age=" + age + "\tsalary="+salary+"]";
	}
}

