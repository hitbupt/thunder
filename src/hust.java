

import java.util.*;
   




public class hust {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		
		while(T--!=0) {
			int A = cin.nextInt();
                        int tmp = 1;
                        int time = A;
			while(time--!=0)
			{
                                 if(tmp<10)
                                    tmp = tmp*A;

                                 else
                                    tmp = (tmp%10)*A;
			}
		
			System.out.println(tmp%10);
               }
	}
}