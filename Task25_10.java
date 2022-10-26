import java.util.Scanner;

public class Task25_10 {
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
