public class Student 
{
	//declaring variables
	long studentid;
	int ex,minor,fin,cl,pts,pct;
	int[] assignments;
	int total=0;
	char Gr;
	String str;
	
	//method to roundoff marks
	public int roundOff(double x)
	{
		int y=(int) Math.round(x);
		return y;
	}
	
	//method for initiating calculation for each student
	public void init(String str)
	{
		str=str.replaceAll("  "," ");
		String[] tokens=str.split(" ");
		studentid=Long.parseLong(tokens[0]);
		ex=Integer.valueOf(tokens[1]);
		assignments=new int[10];
		
		//adding value to assignment array
		for(int i=2;i<12;i++)
		{
			assignments[i-2]=Integer.valueOf(tokens[i]);
			total+=assignments[i-2];
		}
		
		minor=Integer.valueOf(tokens[12]);
		fin=Integer.valueOf(tokens[13]);
		cl=Integer.valueOf(tokens[14]);
		pts=ex+total+minor+fin+cl;
		double temp=((double)pts*100)/420;
		pct=roundOff(temp);
		
		//check the grade of student
		Grade(pct);
		
	}

	//method to find grade of the student
	private void Grade(int pct) {
		if(pct>=90)
			Gr='A';
		else if(pct<=89 && pct>=78)
			Gr='B';
		else if(pct<=77 && pct>=62)
			Gr='C';
		else if(pct<=61 && pct>=46)
			Gr='D';
		else if(pct<=45)
			Gr='F';
	}
}
