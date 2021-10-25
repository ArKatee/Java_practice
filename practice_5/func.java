import java.util.Scanner;


public class func {
    public static String recursion(int n) {
        if(n==1)
            return "1";
        return recursion(n - 1) + " " + n;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        System.out.println("Числа от одного до n: ");
        System.out.println(recursion(n));

    }
}
