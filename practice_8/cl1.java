import java.util.HashMap;

public class cl1 {
    public static void main(String[] args) {
        HashMap<String, Pet> map = new HashMap<>();
        map.put("Pet", new Pet());
        map.put("Cat", new Cat());
        map.put("Dog", new Dog());
        map.put("Owl", new Owl());
        Object[] array = map.keySet().toArray();
        Object[] array_2 = map.values().toArray();
        System.out.println(array[0] + " " + array_2[0]);
        System.out.println(array[1] + " " + array_2[1]);
        System.out.println(array[2] + " " + array_2[2]);
        System.out.println(array[3] + " " + array_2[3]);

        map.put("SuperCat", new Cat());
    }
}
