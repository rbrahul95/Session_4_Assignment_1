/*
Print reverse of an array.
 */
package acadglid;

//Problem 1
public class Session_4_Assignment_1 {
    public static void main (String[] args){ 
int arrnum [] = new int []{12,10,100,67,90}; 
// print the original array 
System.out.println("printing original array"); 
for (int i=0;i<arrnum.length;i++){ 
System.out.println(arrnum[i]); 
} 
// print in reverse 
System.out.println("printing reversed array"); 
for (int i = arrnum.length - 1;i>=0;i--){ 
System.out.println(arrnum[i]); 
} 
}
}
