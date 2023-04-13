import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.AbstractMap;

public class FirstTask {

//    Реализуйте структуру телефонной книги с помощью HashMap,
//    учитывая, что 1 человек может иметь несколько телефонов.

    HashMap<String, String> hashMap;
    FirstTask(){
        hashMap = new HashMap<>();
    }
    public void addDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number phone: ");
        String numberPhone = in.nextLine();
        System.out.println("Enter name: ");
        String name = in.nextLine();
        hashMap.put(numberPhone, name);
        System.out.println(hashMap);

    }

    public void printDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Search by phone - 1; Search by name - 2;");
        int request = in.nextInt();
        String phoneRequest;
        String nameRequest;
        if (request == 1){
            in.nextLine();
            System.out.println("Enter number phone to search: ");
            phoneRequest = in.nextLine();
            if (hashMap.containsKey(phoneRequest)) {
                for (Map.Entry<String, String> item : hashMap.entrySet()) {
                    if (item.getKey().equals(phoneRequest)) {
                        System.out.println(item);
                    }
                }
            } else System.out.println("Number phone not found!");
        } else {
            in.nextLine();
            System.out.println("Enter name to search: ");
            nameRequest = in.nextLine();
            if (hashMap.containsValue(nameRequest)) {
                for (Map.Entry<String, String> item : hashMap.entrySet()) {
                    if (item.getValue().equals(nameRequest)) {
                        System.out.println(item);
                    }
                }
            }
            else System.out.println("Name not found!");
        }
        System.out.println(hashMap);

    }


    public void deleteData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Delete by phone - 1; Delete by name - 2;");
        int request = in.nextInt();
        String phoneRequest;
        String nameRequest;
        if (request == 1){
            in.nextLine();
            System.out.println("Enter number phone to delete: ");
            phoneRequest = in.nextLine();
            if (hashMap.containsKey(phoneRequest)) {
                while (hashMap.containsKey(phoneRequest)) {
                    hashMap.keySet().remove(phoneRequest);
                }
            }else System.out.println("Number phone not found!");
        } else {
            in.nextLine();
            System.out.println("Enter name to delete: ");
            nameRequest = in.nextLine();
            if (hashMap.containsValue(nameRequest)) {
                while (hashMap.containsValue(nameRequest)) {
                    hashMap.values().remove(nameRequest);
                }
            } else System.out.println("Name not found!");
        }
        System.out.println(hashMap);

    }

}
