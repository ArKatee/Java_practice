import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        List<Integer> player1 = new LinkedList<Integer>();
        List<Integer> player2 = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            player1.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            player2.add(scanner.nextInt());
        }


        for (int i = 1; i <= 106; i++) {
            Integer a, b;
            a = player1.get(0);
            player1.remove(0);
            b = player2.get(0);
            player2.remove(0);
            if (a == 0 && b == 9) {
                player1.add(a);
                player1.add(b);
            } else if (a == 9 && b == 0) {
                player2.add(a);
                player2.add(b);
            } else if (a > b) {
                player1.add(a);
                player1.add(b);
            } else if (b > a) {
                player2.add(a);
                player2.add(b);
            }

            if (player1.isEmpty()) {
                System.out.print("second ");
                System.out.print(i);
                return;
            }
            if (player2.isEmpty()) {
                System.out.print("first ");
                System.out.print(i);
                return;
            }
        }

        System.out.print("botva");
    }
}