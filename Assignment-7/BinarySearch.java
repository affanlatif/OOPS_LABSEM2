import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number of elements: "); int n=sc.nextInt();
  if(n<=0){System.out.println("Invalid array size.");sc.close();return;}
  int[] arr=new int[n];System.out.println("Enter array elements:");
  for(int i=0;i<n;i++)arr[i]=sc.nextInt();
  Arrays.sort(arr);System.out.println("Sorted Array: "+Arrays.toString(arr));
  System.out.print("Enter element to search: ");int key=sc.nextInt();
  int low=0,high=n-1,pos=-1;
  while(low<=high){int mid=low+(high-low)/2;if(arr[mid]==key){pos=mid;break;}else if(arr[mid]<key)low=mid+1;else high=mid-1;}
  if(pos!=-1)System.out.println("Element found at position "+(pos+1)+" in the sorted array.");
  else System.out.println("Element not found.");
  sc.close();
 }
}