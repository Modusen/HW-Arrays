import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1st + 2nd task
        System.out.println("1 задача и 2 задача");

        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1)
            System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i]);
        }
        double [] doubles = {1.57, 7.654, 9.986};
            System.out.println(Arrays.toString(doubles));


        int[] ints = {1, 2, 3, 15, 12, 54, 664};
        for (int i = 0; i < ints.length - 1; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println(ints[ints.length - 1]);

System.out.println("А теперь в обратном порядке (3 задача)");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(arr[i] + ", ");
            else {
                System.out.println(arr[i]);
            }
        }

        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(doubles[i] + ", ");
            else {
                System.out.println(doubles[i]);
            }
        }
        for (int i = ints.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(ints[i] + ", ");
            else {
                System.out.println(ints[i]);
            }
        }
System.out.println("Сделаем все числа четными (4 задача var.1)");

        for (int i = 0; i < arr.length; i++) {
            if ( i < arr.length-1 && arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
            else if ( i < arr.length-1 && arr[i] % 2 != 0) {
                System.out.print((arr[i] + 1) + ", ");
            }
            else if (i == arr.length - 1 && arr[i] % 2 != 0) {
                System.out.println(arr[i] + 1);
            }
            else if (i == arr.length - 1) {
                System.out.println(arr[i]);
            }
        }

System.out.println("Сделаем все числа четными (4 задача var.2)");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 !=0) {
                arr[i] = arr[i] + 1;
            }
            if (i < arr.length-1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i]);
        }


System.out.println("PS. Вроде всё работает, но чувствуется мне, что это говнокод :)");

    }
}