//public class MAin {
//    public static void main(String[] args) {
//        System.out.println("Проверка на вес");
//        System.out.println("Проверка на наличие марки");
//        System.out.println("Проверка на размер");
//
////        int valueOfLetters = 4;
//
////        int[] a = {87, 12, 4, 96, 43};
////                  0   1   2   3    <- indexes
//        int experimentValue = 2;
//        int count = 0;
////
//        for (int i = 0; i < 10; i++){
////            System.out.println(a[i]);
//            experimentValue = experimentValue * 2;
//            System.out.println(experimentValue);
//            count = count + 1;
//        }
//////        System.out.println("count is : " + count);
//////        for (int i = 0; true; i++){
//////            if (a[i] % 2 == 0)
//////                System.out.println(a[i]);
//////        }
//////        for (int i = 10, k = 100; i > 0 ; i--, k--) {
//////            System.out.println(i + " " + k);
//////        }
//////        for (int i = 5, k = 11; i != k; i++, k--) {
//////            System.out.println(i + " " + k);
//////        }
////        String[] b = {"hello", "java"};
////
////        for (String element : b) {
////            System.out.println(element);
////        }
//    }
//}
////
import java.util.Scanner;
//
public class MAin {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;

        for ( int i = 1;  i <= num; i++ ){
            sum = sum + i;

        }
        System.out.println(" Сумма всех чисел от 1" +
                       " до введённого числа = " + sum);
    }
}
