import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        FirstTask firstTask = new FirstTask();
//        while (true) {
//            System.out.println("Enter operation: \n" +
//                    "add data - 1 \n" +
//                    "print data - 2 \n" +
//                    "delete data - 3 \n");
//            int action = in.nextInt();
//            if (action == 1) {
//                firstTask.addDate();
//            } else if (action == 2) {
//                firstTask.printDate();
//            } else if (action == 3) {
//                firstTask.deleteData();
//            } else break;
//        }


//        SecondTask secondTask = new SecondTask();
//        secondTask.getString();
//        secondTask.sortString();


    FourthTask fourthTask = new FourthTask();
//    int [][] arr = fourthTask.secondMethodEightQueens(fourthTask.arr);
    int [][] arr1 = fourthTask.thirdMethodeightQueen(1);
    fourthTask.printArray(arr1);


//        fourthTask.printArray(fourthTask.arr);
//        System.out.println(fourthTask.vertical(6, 1));
//        System.out.println(fourthTask.horizontal(6, 1));
//        System.out.println(fourthTask.fitrstDiag(6, 1));
//        System.out.println(fourthTask.secondDiag(6, 1));








    }
}
