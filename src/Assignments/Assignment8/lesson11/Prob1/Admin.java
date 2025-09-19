package Assignments.Assignment8.lesson11.Prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		if(students==null) return null;
		HashMap<Key,Student> table = new HashMap<>();
		for(Student student:students){
			if(student!=null){
				Key k = new Key(student.getFirstName(),student.getLastName());
				table.put(k,student);
			}
		}
		return table;
	}
}
