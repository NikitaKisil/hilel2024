package taxes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double taxRate1 = 2.5;
        double taxRate2 = 4.3;
        double taxRate3 = 6.7;

        char hryvnia = '₴';

        Scanner scanner = new Scanner(System.in);

        double taxRate = 0.0;
        double taxAmount;
        double netIncome;
        System.out.println("Ведіть ваш прибуток за квартал:");

        int amount = scanner.nextInt();

        if (amount >= 0 && amount <= 10000) {
            taxRate = taxRate1;
        } else if (amount > 10000 && amount <= 25000) {
            taxRate = taxRate2;
        } else if (amount > 25000) {
            taxRate = taxRate3;
        } else {
            System.out.println("Введено некоректне значення прибутку.");
        }

        taxAmount = amount * taxRate / 100;
        netIncome = amount - taxAmount;

        System.out.printf("Процентна ставка податку: %.1f%%\n", taxRate);
        System.out.printf("Сума податку: %.2f %c\n", taxAmount, hryvnia);
        System.out.printf("Доход після сплати податку: %.2f %c\n", netIncome, hryvnia);

        scanner.close();
    }


}

