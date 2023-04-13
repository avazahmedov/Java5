import java.awt.*;
import java.util.Random;

// Здравствуйте Антон! Я решил первые две задачи, почти уверен что правильно. А вот над четвертой
// задачей я голову сломал. Я создал методы которые проверют вертикаль, горизонталь и диагональ. Потом
// попытался объединить их трем способами но до 8 ми никак не дошел. В первом методе eightQueens я
// просто пробежался по ячейкам, и она поставила на место макимум 6 ферзей. Во втором методе
// secondMethodEightQueens я попробовал случайным образом выюирать ячейки, но тоже не получилось. она максимум
// расставила 7 ферзей. Было пару раз 8 - редкий случай, уверен что это так не делается.
// и Третий метод thirdMethodeightQueen - рекурсивный. я рекурсией продвигал курсор по вертикали, но не смог
// проверить спопоб проверить условие если thirdMethodeightQueen - тру то рекурсия, элс, пред позиция возвращаетс на 0.
// Я сидел над этой задачой 4 дня, надеюсь на ваш фибэкю Спасибо ))
// PS. Третью задачу я просто не успел. Как нибудь сяду за нее после ферзей )

public class FourthTask {
    Random random = new Random();
    int[][] arr;
    FourthTask(){
        arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
            }
        }
    }

    public void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int vertical(int b){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][b];
        }
        return sum;
    }

    public int horizontal(int a){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[a][i];
        }
        return sum;
    }

    public int fitrstDiag(int a, int b){
        int sum = 0;
        if (a>b) {
            int row = a-b;
            for (int i = 0; row < arr.length; i++, row++) {
                sum += arr[row][i];
            }
        } else {
            int col = b - a;
            for (int i = 0; col < arr.length; i++, col ++) {
                sum += arr[i][col];
            }
        }
        return sum;
    }

    public int secondDiag(int a, int b){
        int sum = 0;
        if ((a+b)>=arr.length){
            int row = (a+b) - arr.length;
            for (int i = arr.length-1; row < arr.length; i--, row++) {
                sum += arr[row][i];
            }
        } else if ((a+b)< arr.length) {
            int col = (a+b);
            for (int i = 0; col>=0; col--, i++) {
                sum += arr[i][col];
            }
        }
        return sum;
    }


    public int[][] eightQueens(int[][] arr){
        Random random = new Random();
        int s = 0;
        while (s != 8){
            int a = random.nextInt(0,8);
            int b = random.nextInt(0,8);
            for (int i = a; i < arr.length; i++) {
                for (int j = b; j < arr.length; j++) {
                        if ((horizontal(i) + vertical(j) + fitrstDiag(i, j) + secondDiag(i, j)) == 0)
                            arr[a][b] = 1;
                    }
                }
            s = sumArray();
            }
        return arr;
    }

    public int[][] secondMethodEightQueens(int[][] arr){
        int s = 0;
        int sum = 0;
        s = sumArray();
        while (s != 8){
            int a = random.nextInt(0,8);
            int b = random.nextInt(0,8);
            if (arr[a][b] == 0 && (horizontal(a) + vertical(b) + fitrstDiag(a, b) + secondDiag(a, b)) == 0) {
                arr[a][b] = 1;
            }
            s = sumArray();
            sum += s;
            System.out.println(s);
            if (sum > 1000){
                System.out.println("Запусти программу заново! ");
                break;
            }
        }
        return arr;
    }

    public int[][] thirdMethodeightQueen(int i){
        if (i == 8) return arr;
        arr[0][0] = 1;
        for (int j = 0; j < 8; j++) {
            if (i>0 && vertical(j) + horizontal(i) + fitrstDiag(i, j) + secondDiag(i, j) == 0) {
            arr[i][j] = 1;
            thirdMethodeightQueen(i+1);
            }
            else arr[i][j] = 0;
        }
        return arr;
    }
    public int sumArray(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
