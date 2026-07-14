import java.util.*;
public class CountingSort
{
public static int range(int arr[],int a,int n)
{
int k=arr[a];
for(int i=1;i<n;i++)
{
if(arr[i]>arr[i-1])
{
k=arr[i];
}}
return k;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter size of the array");
n=sc.nextInt();
int arr[]=new int[n];
int b[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int k=range(arr,0,n);
int count[]=new int[k+1];
for(int i=0;i<=k;i++)
{
count[i]=0;
}
for(int i=0;i<n;i++)
{
count[arr[i]]++;
}
for(int i=1;i<=k;i++)
{
count[i]=count[i]+count[i-1];
}

for(int i=n-1;i>=0;i--)
{
b[--count[arr[i]]]=arr[i];
}
for(int i=0;i<n;i++)
{
arr[i]=b[i];
}
System.out.println("sorted array:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]);}
}
}