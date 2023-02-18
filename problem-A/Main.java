import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        System.out.println("Input two variables: ");
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calc4 = new Calculator();
        System.out.print(calc1.Add(a,b));
        System.out.print(calc2.Substract(a,b));
        System.out.print(calc3.Multiplication(a,b));
        System.out.print(calc4.Division(a,b));
    }
}
