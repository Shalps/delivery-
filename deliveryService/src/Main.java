import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address address1 = new Address("USA", "Washington");
        Address address2 = new Address("Russia", "Tula");
        HashMap<Address, Integer> costPerAddress = new HashMap<>();
        int totalPrice = 0;
        HashSet<Address> addresses = new HashSet<>();

        costPerAddress.put(address1, 150);
        costPerAddress.put(address2, 200);


        while (true) {
            System.out.println("            ");
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scanner.nextLine();
            if (country.equalsIgnoreCase("end")){
                System.out.println("Программа завершена");
                break;
            }
            System.out.print("Введите город: ");
            String city = scanner.nextLine();
            if (city.equalsIgnoreCase("end")){
                System.out.println("Программа завершена");
                break;
            }
            System.out.print("Введите вес (кг): ");
            String kg =scanner.nextLine();
            if (kg.equalsIgnoreCase("end")){
                System.out.println("Программа завершена");
                break;
            }


            Address address3 = new Address(country, city);

            if (costPerAddress.containsKey(address3)) {
                addresses.add(address3);
                int price = Integer.parseInt(kg) * costPerAddress.get(address3);
                totalPrice += price;
                System.out.println("Стоимость доставки составит:" + price + " руб.");

                System.out.println("Общая стоимость всех доставок: " + totalPrice + " руб.");
                System.out.println("Количество уникальных стран в которые были оформлены доставки: " + addresses.size());
            } else {
                System.out.println("Такой адрес не обслуживается.");
            }
            System.out.println(" Для выхода из программы введите <end>");


        }

    }
}