import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String str,substring="",longest="";

        int len,i,j,k;
        System.out.println("Enter String");
        str=sc.nextLine();
        len=str.length();
        for(i=0;i<=len;i++) {
            for(j=0,k=i;k<=len;j++) {

            substring=str.substring(j,k);
            if(palindrome(substring))
                longest=substring;
            k++;
        }
        }
        System.out.println(longest);


    }
    static boolean palindrome(String str)
    {
        int len=str.length();
        int i;
        String temp="";
        for(i=len-1;i>=0;i--) {
            temp=(temp+str.charAt(i));
        }
        if(temp.equals(str)) 
            return true;
        else return false;



    }

}
