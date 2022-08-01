package fffor;

public class Student {

	static int count = 0;
	
	int id;
	String name;
	
	Student(int _id, String _name) {
		Student.count++;
		id= _id;
		name = _name;
		
	}
}
