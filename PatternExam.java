import java.util.Scanner;
import java.util.*;

public class PatternExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int mid=input.length()/2;
        String val=input.substring(mid)+input.substring(0,mid);
        System.out.println(val);
        String[] temp=new String[val.length()];
        Arrays.fill(temp," ");
        String  splval=String.join("",temp);
        
        //non brute force
        for(int i=0;i<val.length();i++){
            System.out.println(splval.substring(0,val.length()-1-i)+val.substring(0,i+1));
        }

    }
}
