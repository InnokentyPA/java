/*1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Task();
    }
    public static void Task() {
        onTask1(new int[] {1, 2, 3, 1, 6, 2});
        onTask2(new int[] {1, 2, 3, 1, 6, 2});
    }
    public static void onTask1(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i : arr) {
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("");
    }
    public static void onTask2(int[] arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i : arr) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            System.out.print (queue.poll() + " ");
        }
        System.out.println("");
    }
}
