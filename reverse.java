# reverse
import java.io.*;
import java.util.*;
public class reverse{
pblic static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k, m=0;
System.out.println("Enter the number");
k=sc.nextInt();
while(k!=0){
m=m*10;
m=m+k%10;
k=k/10;
}
System.out.println("The reverse number is:"+m);
}
}
