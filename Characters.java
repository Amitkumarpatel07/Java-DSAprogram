import java.util.*;
public class Main{
    public static void main(String args[]){
        for (char ch = 'A'; ch <= 'z'; ch++){
            System.out.println((char) (ch | ' '));
        }
    }
}
