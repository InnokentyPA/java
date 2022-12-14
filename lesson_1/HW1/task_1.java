// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int numb = in.nextInt();
            int s=0;
            int f=1;
            for (int i = 1; i <= numb; i++) {                
               s+=i;
               f*=i;
            }
            System.out.println("Треугольного число: " + s);
            System.out.println("Факториал числа: " + f);
        }
    }
}