package practice_12;

import java.util.Scanner;
import java.util.HashMap;

public class z1_1
{

        private static final Scanner in = new Scanner(System.in);
        public static void main(String[] args)
        {
            var database = new HashMap<String, String>(5);
            database.put("0123456789", "Иванов И. И.");
            database.put("1234567890", "Петров П. П.");
            database.put("2345678901", "Сидоров А. В.");
            database.put("3456789012", "Кузнецов М. К.");
            database.put("4567890123", "Попов А. Е.");
            database.put("5678901234", "Васильев А. В.");
            System.out.print("Введите Ф.И.О.: ");
            String name = in.nextLine();
            System.out.print("Введите ИНН: ");
            String inn = in.next();
            try // заключаем в try код, в котором может произойти исключение
            {
                String dbName = database.get(inn);
                if (!name.equals(dbName))
                {
                    throw new z1("!!! ИНН \"" + inn + "\" НЕ действителен для \"" + name + "\" !!!");
                }
                System.out.println("ИНН \"" + inn + "\" действителен для \"" + name + "\".");
            }
            catch (z1 exception)
            {
                System.out.println(exception.getMessage());
            }
        }

}
