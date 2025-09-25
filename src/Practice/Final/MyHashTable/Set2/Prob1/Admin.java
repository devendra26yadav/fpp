package Practice.Final.MyHashTable.Set2.Prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		if(students==null) return null;
		HashMap<Key , Student> reports = new HashMap<>();
		for(Student student:students){
			if(student!=null){
				Key k = new Key(student.getFirstName(),student.getLastName());
				reports.put(k,student);
			}
		}

		return reports;
	}
}
