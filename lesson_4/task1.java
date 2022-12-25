/*Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка. */
import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> user_arr = new LinkedList<String>();
        int list_size = user_arr.size();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter str(text~num): ");
            String user_input = iScanner.nextLine();
            if (user_input.equals("stop")) break;

            String[] my_list = user_input.split("~");
            String text = my_list[0];
            int num = Integer.parseInt(my_list[1]);

            if (text.equals("print")) {
                if (num > list_size) {
                    System.out.printf("Элемент не найден. Длина списка%s%n", list_size);
                    continue;
                } else {
                    System.out.println(user_arr.get(num));
                    user_arr.remove(num);
                    list_size = user_arr.size();
                    continue;
                }
            }
            if (num > list_size) {
                for (int i = list_size; i < num; i++) {
                    if (i == num) {
                        user_arr.add(text);
                    } else user_arr.add(null);
                }
                list_size = user_arr.size();
            } else user_arr.add(num, text);
        }
        iScanner.close();
        System.out.println(user_arr);
    }
}