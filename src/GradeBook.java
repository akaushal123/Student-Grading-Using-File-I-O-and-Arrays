import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	
	public static void main(String[] args)throws Exception
	{
		//opening the input data file
		File file=new File("Files//HW1-data.txt");
		
		//scanner for taking input
		Scanner sc =new Scanner(file);
		String str;
		
		//list for array of student
		ArrayList<Student> students =new ArrayList<Student>();
		Student student;
		
		//apppending data to arrayList
		while(sc.hasNextLine())
		{
			student =new Student();
			str=sc.nextLine();
			student.init(str);
			students.add(student);
		}

		sc.close();
		
		FileCreator fw=new FileCreator();
		fw.init(students);
		System.out.println("complete");
	}

}
