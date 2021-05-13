package comparatorsAndComparables;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Student> students= new ArrayList<>();
		students.add(new Student(55,"Vinit"));
		students.add(new Student(55,"Ananya"));
		students.add(new Student(56,"Vipul"));
		students.add(new Student(56,"Chheda"));
		Collections.sort(students,( o1,  o2) ->{
				if(o1.name.equals(o2.name)) {
					return o1.marks-o2.marks;
				}else {
				return o1.name.compareTo(o2.name);
				}
				});
		students.forEach(System.out::println);
		
	}
	
}
class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}else {
		return o1.name.compareTo(o2.name);
		}
	}
	
}