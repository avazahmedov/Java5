import java.util.*;
import java.util.stream.Collectors;

public class SecondTask {
//    Пусть дан список сотрудников
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством
//    повторений. Отсортировать по убыванию популярности.

    Scanner in = new Scanner(System.in);
    ArrayList<String> newList = new ArrayList<>();
    SortedMap<String, Integer> treeMap = new TreeMap<>();
    public void getString(){
        String s = "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";
        String[] newStrArr = s.split("\n");
        System.out.println(Arrays.toString(newStrArr));
        for (int i = 0; i < newStrArr.length; i++) {
            String[] m = newStrArr[i].split(" ");
            newList.add(m[0]);
        }
        System.out.println(newList);
    }

    public void sortString(){
        for (int i = 0; i < newList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < newList.size(); j++) {
                if (newList.get(i).equals(newList.get(j))) {
                    counter += 1;
                }
            }

            treeMap.putIfAbsent(newList.get(i), counter);
        }
        System.out.println(treeMap);
        List<Map.Entry<String, Integer>> list = treeMap.entrySet().stream()
                .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toList());
        System.out.println(list);
    }

}
