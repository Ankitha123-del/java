import java.util.Scanner;
public class prime{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int i,count=0;
for(i=1;i<=n;i++){
if(n%i==0){
count+=1;
}
}
if(count==2){
System.out.println("yes it is prime");
}
else{
System.out.println("not prime");
}
}
}