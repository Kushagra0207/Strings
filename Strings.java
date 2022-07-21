/* Writtein and Notes By- Kushagra Gupta 21 july 2022
 * 
 * 
 * Getting Strated with Strings in JAVA
 * Strings is a sequence of characters and have a small set(Ascii value is only 0 to 256 and in it only
 * starting 128 are usefull mainly.)
 * Strings in java use UTF-16 which have 16 bits for holding the character.
 * UTF-16 Unicode Transformation format which have more numbers of language transformation and support.
 * ASCII American Standard for Information interchnage
 * 'a'=97 'b'=98 and 'A'=65 'B'=66
 * 
 * 
 * 
 *      char x='a';
   *     System.out.println((int)x);//97
   * 
   * Example problem 1 - Write a program in java to print the frequencies of a character in
   * increasing order.
 */
import java.util.*;
public class Strings{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String  :");
    String A = sc.next();//kushagra
    int arr[] = new int[26];
    
    for (int i = 0; i <A.length(); i++) {
        
        arr[A.charAt(i)-'a']++;
    }
    for(int i=0;i<26;i++){
        if(arr[i]!=0){
            System.out.println((char)(i+'a') + " " + arr[i]);
        }
    }
       
        
    }
}