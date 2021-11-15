import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class practice_11  // Основной класс.
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Кол-во лошадей: ");
        int num = in.nextInt();
        startHorses(num);
    }

    public static void startHorses(int horse_number)
    {
        Object lock = new Object();
        List<Thread> horses = new ArrayList<Thread>(horse_number);
        String number;
        for (int i = 1; i < horse_number + 1; i++)
        {
            number = i < 10 ? ("0" + i) : "" + i;
            Thread horse_i = new Thread(new HorseThread(lock, "Лошадь_" + number));
            horses.add(horse_i);
        }
        for (int i = 0; i < horse_number; i++)
        {
            horses.get(i).start();
        }
    }
}

class HorseThread implements Runnable
{
    private Object lock;
    private String name;

    public HorseThread(Object lock, String name)
    {
        this.lock = lock;
        this.name = name;
    }

    @Override  // так как в Java уже есть встроенный метод run() для потоков.
    public void run()
    {
        synchronized (lock)
        {
            String k = "";
            for (int i = 0; i < 10001; i++)
            {
                if (i == 10000)
                {
                    k = " финишировала";
                    System.out.println(name + k);
                    try  // при отсутствии исключений
                    {
                        Thread.sleep(500);  // приостановка потока
                    }
                    catch (InterruptedException e)  // в случае исключения:
                    {
                        e.printStackTrace();  // указание строки, в которой метод вызвал исключение
                    }
                    lock.notify();
                    try  // при отсутствии исключений
                    {
                        lock.wait(1000);  // остановка потока на 1 секунду
                    }
                    catch (InterruptedException e)  // в случае исключения
                    {
                        e.printStackTrace();  // указание строки, в которой метод вызвал исключение
                    }
                }
            }
        }
    }
}
