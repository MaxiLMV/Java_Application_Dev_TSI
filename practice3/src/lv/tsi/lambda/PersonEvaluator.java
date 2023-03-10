package lv.tsi.lambda;

import java.util.ArrayList;
import java.util.List;

class PersonEvaluator {
    static List<Person> l = new ArrayList<>();
    public PersonEvaluator(List<Person> list) {
        l = list;
    }
    public static void findAndPrint(List<Person> l) {
        System.out.println("--------Names starting with P--------");
        l.stream().filter(x -> x.name.startsWith("P")).forEach(x -> System.out.println(x.name));
        System.out.println("----Names of people older than 18----");
        l.stream().filter(x -> x.age > 18).forEach(x -> System.out.println(x.name));
    }
    public static void groupAndPrint(List<Person> l) {
        System.out.println("------------Groups by age------------");
        for (int i = 0; i < 120; i++) {
            boolean s = true;
            for (Person j : l) {
                if (i == j.getAge()){
                    if (s) {
                        System.out.print("Age " + i + ": ");
                        s = false;
                    }
                    System.out.print(j.getName());
                    System.out.print(" ");
                }
            }
            if (!s) {
                System.out.println();
            }
        }
    }
    public static void getAverageAge(List<Person> l) {
        System.out.println();
        int average = 0;
        for (Person j : l) {
            average += j.getAge();
        }
        average /= l.size();
        System.out.println("Age average: " + average + ".");
    }
}
