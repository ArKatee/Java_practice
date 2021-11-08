import java.util.Scanner;
import java.util.Stack;

public class ex1 {
    public static void main(String[] args) {
        Stack<Integer> player1 = new Stack<Integer>();
        Stack<Integer> player2 = new Stack<Integer>();
        Stack<Integer> buf1 = new Stack<Integer>();
        Stack<Integer> buf2 = new Stack<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i =0; i < 5; i++) {
            buf1.push(scanner.nextInt());
        }
        for (int i =0; i < 5; i++) {
            buf2.push(scanner.nextInt());
        }
        while (!buf1.empty()){
            player1.push(buf1.pop());
        }
        while (!buf2.empty()){
            player2.push(buf2.pop());
        }


        for (int i = 1; i <= 106; i++){
            Integer a, b;
            a = player1.pop();
            b = player2.pop();
            if (a == 0 && b == 9){
                buf1.push(a);
                buf1.push(b);
            }
            else if (a == 9 && b == 0){
                buf2.push(a);
                buf2.push(b);
            }
            else if (a > b) {
                buf1.push(a);
                buf1.push(b);
            }
            else if (b > a) {
                buf2.push(a);
                buf2.push(b);
            }

            if (player1.empty()){
                while (!buf1.empty()){
                    player1.push(buf1.pop());
                }
            }
            if (player2.empty()){
                while (!buf2.empty()){
                    player2.push(buf2.pop());
                }
            }

            if (player1.empty()){
                System.out.print("second ");
                System.out.print(i);
                return;
            }
            if (player2.empty()){
                System.out.print("first ");
                System.out.print(i);
                return;
            }
        }

        System.out.print("botva");
    }
}