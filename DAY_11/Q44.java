import java.util.*;
public class Q44{
public static int factorial(int a){
int f = 1;
for(int i=1;i<=a;i++){
f=f* i;}
return f;
}


    
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.print("a :");
int a = sc.nextInt();
int fac = factorial(a);
System.out.println("f= " + fac);
}
}