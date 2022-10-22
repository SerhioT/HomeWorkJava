import java.util.Scanner;


public class Drinks {
      public String getEspresso() {

         return  "Prepare 'Espresso' - 20 g coffee + 60 ml of hot water.";
      }

      public static void main(String[] args) {

          Drinks drinks = new Drinks();

        System.out.println("Choose a drink: \n" +
                " 1 - 'Espresso' " +
                "\n 2 - Amerikano" +
                "\n 3 - Cappuchino" +
                "\n 4 - Tea");

        Scanner scanner = new Scanner(System.in);
        int drink = scanner.nextInt();

        String prepare;

        switch (drink) {
            case 1:
                prepare = drinks.getEspresso();
                break;
            case 2:
                prepare = "Prepare 'Americano' - Espresso + 120ml of hot water.";
                break;
            case 3:
                prepare = "Prepare 'Cappuchino' - Espresso + 120ml of hot milk.";
                break;
            case 4:
                prepare = "Prepare 'Tea' - Choosing a tea bag + 180ml of hot water.";
                break;
            default:
                prepare = "The figure does not correspond to drink.";
        }

       System.out.println(prepare);
    }
}