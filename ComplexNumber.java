import java.util.*;
class Main{
    int real;
    int imag;
    public Cmplex(int r,int i){
        https://www.onlinegdb.com/online_java_compiler#editor_1 real = r;
        imag = i;
    }
    
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }
    
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
    
    public static Complex product(Complex a, Complex b){
        
      return new Complex(((a.real*b.real) - (a.imag*b.imag)) , ((a.real*b.imag) + (a.imag*b.real)));
        
    }
    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+ "+" +imag+"i");
        }
    }
}

