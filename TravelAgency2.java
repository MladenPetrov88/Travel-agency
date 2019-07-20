import java.util.Scanner;

public class TravelAgency2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        String paket = scanner.nextLine();
        String VIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (town.equals("Bansko") || town.equals("Borovets")) {
            if (paket.equals("withEquipment") && VIP.equals("yes")) {
                price = 100 * 0.90;
            } else if (paket.equals("withEquipment") && VIP.equals("no")) {
                price = 100;
            }

            if (paket.equals("noEquipment") && VIP.equals("yes")) {
                price = 80 * 0.95;
            } else if (paket.equals("noEquipment") && VIP.equals("no")) {
                price = 80;
            }
        }

        if (town.equals("Varna") || town.equals("Burgas")) {
            if (paket.equals("withBreakfast") && VIP.equals("yes")) {
                price = 130 * 0.88;
            } else if (paket.equals("withBreakfast") && VIP.equals("no")) {
                price = 130;
            }

            if (paket.equals("noBreakfast") && VIP.equals("yes")) {
                price = 100 * 0.93;
            } else if (paket.equals("noBreakfast") && VIP.equals("no")) {
                price = 100;
            }
        }

        if (days > 7) {
            days -= 1;
        }
        double total = price * days;

        if (!town.equals("Bansko") && !town.equals("Borovets") && !town.equals("Varna") && !town.equals("Burgas")
                || !paket.equals("noEquipment") && !paket.equals("withEquipment") && !paket.equals("noBreakfast") && !paket.equals("withBreakfast")) {
            System.out.println("Invalid input!");
        } else if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", total);
        }

    }
}
