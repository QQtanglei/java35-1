package worker9;
import java.util.*;

import sun.misc.Perf.GetPerfAction;
public class School {
	public static void main(String[] args) {
		Student student=new Student();
		Scanner input=new Scanner(System.in);
		StudentManager stu=new StudentManager();
		String stuNo;
		while (true) {
			System.out.println("1、添加学生信息");
			System.out.println("2、修改学生信息");
			System.out.println("3、删除学生信息");
			System.out.println("4、查询学生信息");
			System.out.println("5、打印学生信息");
			System.out.println("6、课程管理");
			System.out.println("7、退出系统");
			System.out.println();
			System.out.println("请输入数字选择操作");
			System.out.println();
			int o=input.nextInt();
			switch (o) {
			case 1:
				student = imports(input);
				boolean rue = stu.addStuNo(student);
				System.out.println(rue?"添加成功":"添加失败");
				break;
			case 2:
				System.out.println("请输入学号");
				stuNo=input.next();
				boolean ruelt ;
				ruelt= stu.Find(stuNo);
				while(!ruelt) {
					System.out.println("暂无该学生信息，请重新输入");
					System.out.println("请输入学号");
					stuNo=input.next();
					ruelt = stu.Find(stuNo);
				}
				System.out.println("请输入姓名");
				String name=input.next();
				System.out.println("请输入年龄");
				int age=input.nextInt();
				System.out.println("请输入性别");
				char sex=input.next().charAt(0);
				while(true) {
					if(sex=='男'||sex=='女') {
						break;
					}else {
						System.out.println("输入有误请重新输入！");
						System.out.println("请输入性别");
						sex=input.next().charAt(0);
					}
				}
				student=new Student(stuNo,name,age,sex);
				boolean updaterue = stu.update(student);
				System.out.println(updaterue?"修改成功":"修改失败");
				break;
			case 3:
				System.out.println("请输入学号");
				stuNo=input.next();
				boolean ruel;
				ruel= stu.Find(stuNo);
				while(!ruel) {
					System.out.println("暂无该学生信息，请重新输入");
					System.out.println("请输入学号");
					stuNo=input.next();
					ruel= stu.Find(stuNo);
				}
				boolean remove = stu.remove(stuNo);
				System.out.println(remove?"删除成功":"删除失败");
				break;
			case 4:
				System.out.println("请输入学号");
				stuNo=input.next();
				boolean find;
				find= stu.Find(stuNo);
				if(find){
					Student stu2 = stu.map.get(stuNo);
					System.out.println("学号："+stuNo+"学生信息："+stu2.toString());
				}else {
					System.out.println("没有查到该学生信息！");
				}
				break;
			case 5:
				stu.println();
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("感谢使用学生管理系统，再见！");
				System.exit(0);
				break;

			default:
				System.out.println("输入有误请重新输入！");
				break;
			}
			
		}
	}

	private static Student imports(Scanner input) {
		Student student;
		System.out.println("请输入学号");
		String stuNo=input.next();
		System.out.println("请输入姓名");
		String name=input.next();
		System.out.println("请输入年龄");
		int age=input.nextInt();
		System.out.println("请输入性别");
		char sex=input.next().charAt(0);
		while(true) {
			if(sex=='男'||sex=='女') {
				break;
			}else {
				System.out.println("输入有误请重新输入！");
				System.out.println("请输入性别");
				sex=input.next().charAt(0);
			}
		}
		
		student=new Student(stuNo,name,age,sex);
		return student;
	}
	
}
