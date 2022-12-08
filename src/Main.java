import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Впишите число: ");
        int Number = in.nextInt();
        int Factorial = 1;
        for(int i = 1;Number >= i;i++){
            Factorial = Factorial * i;
        }
        System.out.println("Факториал от " + Number + " = " + Factorial);
        int Triangular_number = 0;
        for(int i = 1; Number>=i;i++){
            Triangular_number = Triangular_number + i;
        }
        System.out.println("Треугольное число от "+ Number + " = " + Triangular_number);

    }
}