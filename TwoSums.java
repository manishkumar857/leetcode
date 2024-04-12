import java.util.*;
public class TwoSums{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array");
    int size =sc.nextInt();
    System.out.println("Enter Target Number");
    int n = sc.nextInt();
    System.out.println("Enter Values of an Array");
    int[] nums = new int[size];
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=sc.nextInt();
    }
    int[] new1 = new int[size];
    new1 = fun(nums, n);
    System.out.println(new1[0]);
    System.out.println(new1[1]);
    sc.close();
}
public static int[] fun(int nums[],int n)
{
    int[] arr=new int[2];
    for(int i=0;i<nums.length-1;i++)
    {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==n)
            {
            arr[0]= i;
            arr[1]= j;
            }
        }
    }
        return arr;
    }
}