package jihe;
import java.util.*;
public class List1 {
	public static void main(String[] args) {
		List<Worker> list =new ArrayList<>();
		list.add(new Worker("zhang3",18,3000));
		list.add(new Worker("li4",25,3500));
		list.add(new Worker("wang5",22,3200));
		list.add(new Worker("wang2",22,3000));
		list.add(new Worker("li4",22,3200));
		
		list.add(1, new Worker("zhao6",24,3300));//在li4前插入zhao6
		
		Worker o=new Worker("wang5",22,3200);//删除wang5
		list.remove(o);//根据对象删除
		list.remove(3);//根据下标删除
		/**
		 * Iterator迭代器遍历集合
		 */
		Iterator<Worker> iter=list.iterator();
		while(iter.hasNext()) {
		Worker	next=iter.next();
		System.out.println(next);
		}
		/**
		 * 查找对象是否在集合中
		 */
		Worker f=new Worker("zhang3",18,3000);
		boolean rue = list.contains(f);
		System.out.println("rue:"+rue);
		
		
//		TreeSet<Worker> sort=new TreeSet<>(new Comparator<Worker>() {
//
//			@Override
//			public int compare(Worker o1, Worker o2) {
//				if(o1.getAge()!=o2.getAge()) {//按年龄排序
//					return o1.getAge()-o2.getAge();
//				}else{
//					if(o1.getSalary()!=o2.getSalary()) {//按工资排序
//						return (int) (o1.getSalary()-o2.getSalary());
//					}else {
//						return o1.getName().compareTo(o2.getName());//将名字以字典顺序排序
//					}
//				}
//			}
//		});
//		sort.add(new Worker("zhang3",18,3000));
//		sort.add(new Worker("l3",25,3500));
//		sort.add(new Worker("l1",21,3200));
//		sort.add(new Worker("wh1",18,3200));
//		sort.add(new Worker("sdf",21,3200));
//		sort.add(new Worker("wsf",25,3200));
//		sort.add(new Worker("wang5",22,3200));
//		sort.add(new Worker("wang2",22,3000));
//		sort.add(new Worker("wang",27,3100));
//		/**
//		 * forEach遍历集合
//		 */
//		for (Worker worker : sort) {
//			System.out.println(worker);
//		}
		
		
	}

}
