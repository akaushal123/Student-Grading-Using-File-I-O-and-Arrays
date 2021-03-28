import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
public class FileCreator 
{  
	  //function to convert the integer to string
	  public String IntToString(int x,int y)
	  	{
			  if(y - Integer.toString(x).length() == 0)
			  {
				  return Integer.toString(x);
			  }
			  else if(y - Integer.toString(x).length() == 1)
			  {
				  return " "+Integer.toString(x);
			  }
			  else 
			  {
				  return "  "+Integer.toString(x);
			  }
		  }
	  
	  //method to write the data to file
 	  public void init(List <Student> students)
         {
 		  String s;
			  	
 		  try{    
					
			//create the object for output file
			BufferedWriter fw=new BufferedWriter(new FileWriter("Files//HW1-output-16103001.txt",false));
			s = "Stdnt Id  Ex  ------- Assignments ---------  Tot  Mi  Fin  CL  Pts  Pct  Gr";
			fw.write(s);
			fw.newLine();
			s = "--------  --  -----------------------------  ---  --  ---  --  ---  ---  --";
			fw.write(s);
			Double avg = 0.0;
			int counta=0,countb=0,countc=0,countd=0,countf=0;
			int maxPts =0;
			           
			//loop for each student and add the data to output file for each student
			for(Student s1:students)
			{
				if( (Long.toString(s1.studentid)).length() ==7)
					s = "0"+Long.toString(s1.studentid);
				else
					s = Long.toString(s1.studentid);
				s +="  "+ IntToString(s1.ex,2)+" ";	
							
				//loop for adding assignment grades
				for(int i=0;i<10;i++)
					s += " "+IntToString(s1.assignments[i],2);
												
				s += "  "+IntToString(s1.total,3);
				s += "  "+IntToString(s1.minor,2);
				s += "   "+IntToString(s1.fin,2);
				s += "  "+IntToString(s1.cl,2);
				s += "  "+IntToString(s1.pts,3);
				s += "   "+IntToString(s1.pct,2);
				s += "   "+s1.Gr;
				fw.newLine();
				avg += s1.pct;
							
				//count the total grades
				switch (s1.Gr)
				{
					case 'A':counta++;break;
					case 'B':countb++;break;
					case 'C':countc++;break;
					case 'D':countd++;break;
					case 'F':countf++;break;
				}
				if(maxPts < s1.pts)
					maxPts = s1.pts;
							
				fw.write(s);
			}
			fw.newLine();
			fw.newLine();
			s = "Average total point percent of all students: ";
			s += Double.toString(Math.round(avg/students.size()));
			fw.write(s);
			fw.newLine();
			fw.write("Number of A's = " + Integer.toString(counta));
			fw.newLine();
			fw.write("Number of B's = " + Integer.toString(countb));
			fw.newLine();
			fw.write("Number of C's = " + Integer.toString(countc));
			fw.newLine();
			fw.write("Number of D's = " + Integer.toString(countd));
			fw.newLine();
			fw.write("Number of F's = " + Integer.toString(countf));
			fw.newLine();
			fw.newLine();
			fw.write("Maximum points =" + Integer.toString(maxPts));
	        fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
}
