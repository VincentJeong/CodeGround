/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Arrays;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class ProCompetition2 {
	static int Answer;

	public static void main(String args[]) throws Exception	
	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) 
		{
			int people = sc.nextInt();
			
			int point[] = new int[people];
			
			for(int i=0; i<people; i++)
			{
				point[i] = sc.nextInt();
				
			}
			
		Arrays.sort(point);
		
		int max=0;
		int nextPoint[] = new int[people];
		int result=0;
		
		for(int i=0; i<people; i++)
		{
			nextPoint[i] = point[i] + (people-i);
			
			if(nextPoint[i]>max)
			{	max=nextPoint[i];}
			
		}
		
		  for(int i=0; i<people; i++)
	       {
	    	   if(nextPoint[i]==max)
	    		   {result++;}
	       }
			

			
			System.out.println("Case #"+(test_case+1));
			System.out.println(result);
		}
	}
	
}