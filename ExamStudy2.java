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
class ExamStudy2 {
	static int Answer;

	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) 
		{

			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int point[] = new int[N];
			for(int i=0; i<N; i++)
			{
				point[i] = sc.nextInt();
			}
			
		Arrays.sort(point);
		
		int max=0;
		
		for(int i=N-1; i>=N-K; i--)
		{
			max= max+point[i];
		}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(max);
		}
	}
}