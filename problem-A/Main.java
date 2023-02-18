import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calc4 = new Calculator();
        System.out.print(calc1.Add(a,b)+"\n");
        System.out.print(calc2.Substract(a,b)+"\n");
        System.out.print(calc3.Multiplication(a,b)+"\n");
        System.out.print(calc4.Division(a,b));
    }
}
