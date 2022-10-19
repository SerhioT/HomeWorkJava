

import java.util.Scanner;

public class Walk {
    public static void main(String[] args){
        System.out.println("Сегодня выходной день? - Введите 'true' или 'false'");
        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Сегодня идёт дождь? - Введите 'true' или 'false'");
        Scanner scanner1 = new Scanner(System.in);
        boolean isRain = scanner1.nextBoolean();



//        if(isWeekend){
//            canWalk = ;
//            System.out.println( "canWalk = true");
//        } else if (isRain) {
//            System.out.println("canWalk = true");
//        }
        boolean canWalk = (isWeekend) && (!isRain);
        System.out.println("canWalk = " + canWalk);
    }

}
