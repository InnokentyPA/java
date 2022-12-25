/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти. */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class task2 {
    public static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            case "exit":
                sc.close();
                return;
            case "print":
                while (!stack.empty()) {
                    System.out.printIn(stack.pop());
                }
                break;
            case "revert":
                stack.pop();
                break;
            default:
                stack.push(line);
                break;
        }
    }
}
