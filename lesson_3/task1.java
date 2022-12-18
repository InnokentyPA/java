// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> origList = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            origList.add((int) (Math.random()*100));
        }
        origList.sort(null);
        for (Integer elemDuble : origList) {
            System.out.println(elemDuble);
        }
    }    
}
