File name must be CSX-358-HW1-XXXXXXX.java where XXXXX are digits of your rollno.

The purpose of this assignment is to review the use of one-dimensional arrays, reading and writing text files, writing functions, and program planning and development.

This program consist of two parts:
1) Part 1: read and process a student data file, and writing the results to a student report file
2) Part 2: add code to part 1 to calculate some statistics and write them to the end of student report file.

For this assignment, you will be reading one input file and writing out to an output file.
Part 1 
Read in the student data file (HW1-data.txt), partially shown below. Each line of this file consists of a (8-digit numeric) student id, lab exercise points (50), 10 assignment's points (20 each), midterm points (60), final points (100), and CodeLab points (10). For coding, read the entire file assuming you do not know how many lines are in the file (no hard-coding of loop count). You will write the input student data and the results of the processing into a student report file HW1-output-XXXXX.txt that looks "just like" the output shown below. In addition to the input student data, the report should contain the "total" of the assignment grades, the total and percent of all points achieved, and the letter grade.  You may assume that the input data file does not contain any errant data.

...
Points

Lab Exercises	50 points	
10 HW	200 points	
Midterm	70 points	 
Final	100 points	 
Extra Credit: CodeLab	10 points	

Total used for percentage calculation : 420 (not including extra credit)

Grading Scale:
 A        90% and up of total score
 B        78% through 89% of total score
 C        62% through 77% of total score
 D        46% through 61% of total score
 F         45% or less of total score

Input File

![image](https://user-images.githubusercontent.com/25979883/112763886-f5619400-9023-11eb-9553-2bcf5e019af2.png)

 
…..
The Student Report Output File

![image](https://user-images.githubusercontent.com/25979883/112763879-f0044980-9023-11eb-9734-0c8160325de1.png)

 
Part 2 
At the end of the previous report, add the code to write a summary report file that contains the average percent of total points for all students. Also, display the number of A's, B's, C's, D's and F's for the students. Your summary output file should look something like this:

Average total point percent of all students: ??

Number of A's = ??
Number of B's = ??
Number of C's = ??
Number of D's = ??
Number of F's = ??

Maximum points = ???      <- This is the highest number of points achieved by any student
 
Program requirements
1.	You must use at least 1 one-dimension array.  Do not use 2 dimensional arrays - this will be covered in the another assignment.
2.	Your solution must include at least 3 functions, counting the main() function.  One function must include an array argument with a size argument. 
3.	All files must be checked for a successful open.
4.	Make sure you write the student id with a leading 0, if appropriate (i.e. the 7th id).
5.	The percent of total points must be rounded to the nearest integer.  For example, 94.1% becomes 94%,  85.8% becomes 86%, 75.5% is 76% 
6.	The letter grade is determined by the "integer" percent.  
7.	Add headings to your output report file. They should be aligned and correctly identify the column data.
8.	Do not use any global variable.
