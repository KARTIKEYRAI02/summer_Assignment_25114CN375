public class Q18 {
public static void main (String[]args)
   {
int n = 145; 
int temp = n; int totalsum = 0;

     while (temp != 0)
       {
     	int digit = temp % 10;
     	int fact = 1;

     	for (int i = 1; i <= digit; i++)
     	{
     		fact = fact * i;
     	}

     	totalsum = totalsum + fact;
     	temp = temp / 10;
       }

     if (totalsum == n)
       System.out.println (n + " Is a strong number");
     else
       System.out.println (n + " Is not a strong number");

   }
 }