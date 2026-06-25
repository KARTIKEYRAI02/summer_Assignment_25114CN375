import java.util.*;
public class Q41{
public static int sum(int a,int b){
int sum = a+b;
return sum;
}
    
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.print("a :");
int a = sc.nextInt();
System.out.print("b :");
int b = sc.nextInt();
int add = sum(a,b);
System.out.println("Sum =" + add);
}
}