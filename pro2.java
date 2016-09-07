import java.util.*;
import java.io.*;

class pro2
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int nn = n;
int n1=0;
int mul=1;
while(n>0)
{
n1 = n%10;
mul = mul*n1;
n=n/10;
}
mul = mul*nn;
System.out.println(mul);
}
}
