package first;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

//import java.util.Scanner;

//class SortSubjects implements Comparator<Subject> {
//
//	@Override
//	public int compare(Subject s1, Subject s2) {
//		// TODO Auto-generated method stub
//		return s2.getLevel() - s1.getLevel();
//	}
//	
//}

//class ElementException extends Exception {
//	
//	public ElementException(String msg) {
//		super(msg);
//	}
//}

//interface Demo1{
//	public void doSomething(String str);
//}

public class CoreJava {
	
//	public void Exc() throws ElementException {
//		
//		int[] arr = new int[5];
//		Scanner sc = new Scanner(System.in);
//	    
//		for(int i=0;i<=5;i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] > 100) {
//				throw new ElementException("Element is greater than 100");
//			}
//		}
//
//		
//	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		Child c = new Child();
//		c.doSomething();
		
//		Demo d = new Demo();
//		d.add(new int[] {23,45,67});
		
//		Address ad = new Address("Lucknow","UP",226002);
//		
//		
//		Person p = new Person("Ayush",22,ad);
//		
//		
//		
//		System.out.println(p);
//		System.out.println(ad);
		
//		Subject java = new Subject("Java","3M",2);
//		Subject cpp = new Subject("Java","2M",3);
//		Subject php = new Subject("Java","5M",4);
//		Subject js = new Subject("Java","4M",5);
		
		
		
//		Subject[] s = new Subject[4];
//		
//		for(int i=0;i<4;i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Subject, Duration and Level respectively");
//			String name = sc.nextLine();
//			String duration = sc.nextLine();
//			int level = sc.nextInt();
//			
//			s[i] = new Subject(name,duration,level);
//		}
//		
//		for(int i=0;i<4;i++) {
//			System.out.println(s[i]);
//		}
		
//		Student st = new Student("Ayush","CSE",22,s);
//		
//		st.display();
		
//		Shape s = new Square();
//		s.getDetails();
//		System.out.println(s.area());
		
//		Subject[] arr = {
//				new Subject("CPP", "2M", 2),
//				new Subject("JAVA", "2M", 5),
//				new Subject("JS", "2M", 9),
//				new Subject("PYTHON", "2M", 8),
//				new Subject("C", "2M", 3),
//		};
//		
//		Arrays.sort(arr, new SortSubjects());
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].getName());
//		}
		
//		CoreJava j = new CoreJava();
//		
//		try {
//			j.Exc();
//		}
//		catch(ElementException ex) {
//			System.out.println(ex.getMessage());
//		}
		
//		for(int i=0;i<5;i++) {
//			MultiThreading mt = new MultiThreading();
//			
//			try {
//				mt.start();
//			}
//			catch(Exception e){
//				System.out.println(e);
//			}
//		}
		
//		Functional interface -> An interface with only one function declaration.
//		Lambda expression -> It is used to implement functional interface in a better way. It is somewhat similar to Arrow functions in JS.
//		Demo1 d = (p) -> { 
//			System.out.println("implementing doSomething "+p);
//		};
//		
//		d.doSomething("Hello Ayush");
		
		
//		ArrayList
		
//		ArrayList<String> al = new ArrayList<String>();
//		
//		al.add("Ayush");
//		al.add("Sujit");
//		al.add("George");
//		al.add("Parth");
//		
////		for(int i=0;i<al.size();i++) {
////			System.out.println(al.get(i));
////		}
//		
//		al.forEach((s) -> {
//			System.out.println(s);
//		});
		
		List<Integer> it = new ArrayList<Integer>();
		
		it.add(12);
		it.add(23);
		it.add(26);
		it.add(90);
		it.add(100);
		
		List<Integer> r = it.stream().map((n) -> {
			return n*2;
		}).collect(Collectors.toList());
		
		List<Integer> big = it.stream().filter((n) -> {
			
			return n>50;
		}).collect(Collectors.toList());
		
		r.forEach((s) -> {
			System.out.println(s);
		});
		
		
	}

}
