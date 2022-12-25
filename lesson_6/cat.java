import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String color;
    private int age;
    private String breed;
    private List<String> injections;

    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.injections = new ArrayList<String>();
    }

    public void addInjection() {
        this.injections.add(String.valueOf(LocalDateTime.now()));
    }
    public List<String> getInjections() {
        return this.injections;
    }
    public void addAge() {
        this.age++;
    }
    @Override
    public String toString() {
        return "Кличка: " + this.name + " Цвет: " + this.color + " Возраст: " + this.age;
    }
}