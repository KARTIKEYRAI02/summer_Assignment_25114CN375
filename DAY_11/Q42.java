import java.util.*;
public class Q42{
public static int max(int a,int b){
if(a>b){
    return a;
}
return b;
}
    
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.print("a :");
int a = sc.nextInt();
System.out.print("b :");
int b = sc.nextInt();
System.out.println(max(a,b));
}
}