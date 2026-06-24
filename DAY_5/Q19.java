public class Q19 {
public static void main (String[]args)
   {
    int n = 24;
    if(n>0)
    {
        System.out.println("Factors of " + n + " are: ");
     for (int i = 1; i <= n ;i++)
          {
      	if (n % i == 0){
 	        System.out.println(i);
      	         }
          }
        }
   }
}