import javafx.concurrent.Task;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 30, "сиамский", "светлый");
        cat.addInjection();
        cat.addAge();
        System.out.println("Прививки:");
        System.out.println(cat.getInjections());
        System.out.println(cat);
    }
}
