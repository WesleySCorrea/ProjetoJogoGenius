import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int keyNumber = 5;
        int numberRight = 5;
        int yourNumber = 0;
        List<Integer> listNumber = new ArrayList<>();

        System.out.println("Let's go!");
        for (int i=0 ; keyNumber==numberRight; i++) {
            int number = random.nextInt(1, 5);
            listNumber.add(number);
            TimeUnit.SECONDS.sleep(1);
            for (Integer x : listNumber) {
                System.out.println(x);
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }
            for (int y = 0; y < listNumber.size(); y++) {
                System.out.println("Enter the " + (y + 1) + "° number!");
                yourNumber = sc.nextInt();
                if (yourNumber != listNumber.get(y)) {
                    y = listNumber.size() + 1;
                    System.out.println("You had " + (i) + "hits");
                    keyNumber = 0;
                }
            }
            if (keyNumber == numberRight) {
                System.out.println("You're right! You already have a number of hits of " + (i + 1) + "!\nLet's go again");
            }
        }
    }
}
