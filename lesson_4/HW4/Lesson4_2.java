/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - 
возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */
package HW4;
import java.util.LinkedList;
import java.util.List;

public class Lesson4_2<T> {
    private List<T> Data;
    private int index;

    public Lesson4_2(){
        Data = new LinkedList<>();
        index = 0;
    }
    public Lesson4_2(LinkedList<T> data){
        Data = data;
        index = data.size() - 1;
    }
    public boolean add(LinkedList<T> data){
        Data = data;
        return true;
    }
    public boolean add(T data){
        Data.add(data);
        return true;
    }
    public boolean enqueue(T data){
        Data.add(data);
        index++;
        return true;
    }
    public T dequeue(){
        T dev = Data.get(0);
        Data.remove(0);
        index--;
        return dev;
    }
    public T first(){
        return Data.get(0);
    }
    public String toString(){
        return null;
    }
    public List<T> getAll(){
        return Data;
    }
}