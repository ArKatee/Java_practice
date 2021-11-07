import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cl2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int counter = 0;
        for(int i = 0; i < 1000; i++){
            int j = random.nextInt()%500;
            if (list.contains(j))
            {
                counter++;
                continue;
            }
                list.add(j);
        }
        System.out.println(counter);
    }
}
