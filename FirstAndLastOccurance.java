package Recursion;
import java.util.*;

public class FirstAndLastOccurance {
    public static int f=-1;
    public static int l=-1;

    public static void findOcc(String s, int ind, char ch){
        if(ind==s.length()) {
            System.out.println("First Occurace = "+ f);
            System.out.println("Last Occurace = "+ l);
            return;
        }
        char current=s.charAt(ind);
        if(current == ch){
            if(f == -1) f=ind;
            else    l=ind;
        
        }

        findOcc(s,ind+1,ch);
    }
    public static void main(String args[]){
        String st="abchsaajfysdkangdaski";
        findOcc(st,0,'a');

    }
}
