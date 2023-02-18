public class Calculator {
   // private int a;
   // private int b;


    public int Add(int a, int b){
        if (a<0 || b<0){
            throw new ArithmeticException("Both numbers should be positive");
        }
        return a+b;
    }
    public int Substract(int a, int b){
        if (a<0 || b<0){
            throw new ArithmeticException("Both numbers should be positive");
        }
        return a-b;
    }
    public int Multiplication(int a, int b){
        if (a==0 || b==0){
            throw new ArithmeticException("Two numbers should not be zero");
        }
        return a*b;
    }
    public int Division(int a, int b){
        if (a==0 || b==0){
            throw new ArithmeticException("Two numbers should not be zero");
        }
        return a/b;
    }
}
