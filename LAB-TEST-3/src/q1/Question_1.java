package q1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_1 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		
		Map<Student, Integer> map2=new HashMap<>();
		map2.put(new Student(109, "raj", 95), 95);
		map2.put(new Student(61, "keta", 78), 78);
		map2.put(new Student(11, "gunika", 98), 98);
		map2.put(new Student(19, "keshav", 97), 97);
		
		System.out.println("------printing map------");
		
		map.entrySet()
		.stream()
		.forEach(e-> System.out.println(e));
		
		
		System.out.println("---------print only that recrods that contain key contains raj---------");
		
		map.entrySet().stream()
		.filter((m1)->m1.getKey().contains("raj")).collect(Collectors.toList())
		.forEach(e-> System.out.println(e));


	
	System.out.println("------------Sort By Keys-------");
			map.entrySet().stream()
			.sorted((m1,m2)-> m1.getKey().compareTo(m2.getKey())).collect(Collectors.toList())
			.forEach(e-> System.out.println(e));
			
			System.out.println("------------Sort By Values-------");
			map.entrySet().stream()
			.sorted((m1,m2)-> m1.getValue().compareTo(m2.getValue())).collect(Collectors.toList())
			.forEach(e-> System.out.println(e));
			
			System.out.println("------------Sort By Keys in Reverse-------");
			map.entrySet().stream()
			.sorted((m1,m2)-> m2.getKey().compareTo(m1.getKey())).collect(Collectors.toList())
			.forEach(e-> System.out.println(e));
			
			System.out.println("---------------All records sorted as per name of the student----------------");
			
			map2.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
			.forEach(e-> System.out.println(e));
			
			
			System.out.println("-------------All records of students sorted as per ids-------------------");
			
			map2.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
			.forEach(e-> System.out.println(e));
	
	}
}
