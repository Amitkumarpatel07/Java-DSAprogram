public class Main{
    public static int power (int x, int n){
        if(n == 0){
            return 1;
        }
        
        return x * power(x,n-1);
    }
    
    public static void main(String args[]){
        //t arr[] = {5,5,5,5};
        System.out.println(power(2,10));
    }
}
