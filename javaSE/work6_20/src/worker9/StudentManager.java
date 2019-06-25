package worker9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class StudentManager {
	HashMap<String, Student> map=new HashMap<>();
	public StudentManager(){
		map.put("0001",new Student( "0001","张三",22,'男'));
		map.put("0002",new Student( "0002","李四",24,'女'));
		map.put("0003",new Student( "0003","王五",23,'男'));
	}
	/**
	 * 1、添加学生信息
	 * @return 
	 */
	public boolean addStuNo(Student student) {
		if(student==null||map.containsKey(student.getStuNo())==true) {
			return false;
		}
		map.put(student.getStuNo(), student);
		return true;
	}
	
	/**
	 * 2、修改学生信息
	 * @return 
	 */
	public boolean update(Student student) {
		if(map.containsKey(student.getStuNo())) {
			map.put(student.getStuNo(), student) ;
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 3、删除学生信息
	 * @return 
	 */
	public boolean remove(String stuNo) {
		if(map.containsKey(stuNo)){
			map.remove(stuNo);
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 4、查询学生信息
	 */
	public boolean Find(String stuNo) {
		return map.containsKey(stuNo);
	}
	
	/**
	 * 5、打印学生信息
	 */
	public void println() {
//		Set<String> keyset=map.keySet();//返回所有键
//		keyset.stream().forEach(System.out::println);
		Set<Entry<String, Student>>   en=map.entrySet();
		for(Entry<String, Student> en1:en) {
			String key=en1.getKey();
			Student value=en1.getValue();
			System.out.println("key:"+key+"\t value:"+value);
		}	
	}
	/**
	 * 6、课程管理
	 */
	public void CourseManager(){
		
	}
	 
}
