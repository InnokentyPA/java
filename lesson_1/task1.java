import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = myScan.nextLine();
        System.out.printf("Hello, %s", name);
        myScan.close();
    }
}