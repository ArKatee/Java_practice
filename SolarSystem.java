import java.util.Random;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolarSystem {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        String pluto = new String("Плутон");

        List<String> solarSystem1 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter,saturn,uranus,neptune,pluto)));// Неизменяемый список с планетами Солнечной системы.
        List<String> solarSystem2 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, saturn,uranus,neptune,pluto));// Изменяемый список с планетами Солнечной системы:

        System.out.println(solarSystem2);
        solarSystem2.add(jupiter); //добавление
        System.out.println(solarSystem2);

        solarSystem2.remove(pluto); //удаление
        System.out.println(solarSystem2);

        solarSystem2.set(solarSystem1.indexOf(earth), earth + "(we're here)"); //изменения элемента
        System.out.println(solarSystem2);

        Collections.shuffle(solarSystem2); //перемешивание
        System.out.println(solarSystem2);

        System.out.println(solarSystem2.get(abs(new Random().nextInt()%solarSystem2.size()))); //выбор случайной планеты

        System.out.println(solarSystem2.indexOf(saturn)); //показ индекса элемента

        System.out.println(solarSystem2.contains(pluto)); //проверка наличия элемента в списке

        System.out.println(solarSystem2.size());// Возврат размера массива

        Collections.reverse(solarSystem2);//запись массива в обратном порядке
        System.out.println(solarSystem2);

        Collections.swap(solarSystem2, solarSystem2.indexOf(mercury), solarSystem2.indexOf(mars));//смена элементов местами
        System.out.println(solarSystem2);

        Collections.sort(solarSystem2);
        System.out.println(solarSystem2); //сортировка

    }

}
