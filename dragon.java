import java.util.*;
import java.util.ArrayList;
 
public class dragon {
 public static void main(String [] args) {
  Scanner sc = new Scanner(System.in);
  int s = sc.nextInt();
  int n = sc.nextInt();
  int x = 0;
  int y=0;
  int temp=0;
  int win=0;
  int[] list1 = new int[n];
  int[] list2 = new int[n];
 
  for(int i=0;i<n;i++){
   x = sc.nextInt();
   y= sc.nextInt();   
   list1[i]=x;
   list2[i]=y;
  }
  for(int i=0; i<n-1;i++){
    int min = i;
    for(int j=i+1; j<n;j++){
      if(list1[j]<list1[min]){
        min=j;
      }
    }
    temp = list1[min];
    list1[min]=list1[i];
    list1[i]=temp;
    int temp2 = list2[min];
    list2[min]=list2[i];
    list2[i]=temp2;
  }
  for(int k=0;k<n;k++){
     if(s>list1[n-1]){
       System.out.println("YES");
       break;
     }
    if(s>list1[k]){
      s +=list2[k];
    }
    else{
      System.out.println("NO");
      break;
    }
  }
 }
}
 