package edited_app2;

public class Main {
    public static void main(String[] args) {


        String template = "Product No %d: %s,%n"
                + "total sales for %d days is EUR %.2f,%n"
                + "sales by day is EUR %.2f.%n";

        String productName1 = "smartphone";
        int days1 = 5;
        int quantity1 = 1;
        double price1 = 12153.41;

        double totalSales1 = quantity1 * price1;
        double totalSales1Rounded = Math.round(totalSales1 * 100.0) / 100.0;

        double averageSales1 = totalSales1 / days1;
        double averageSales1Rounded = Math.round(averageSales1 * 100.0) / 100.0;

        System.out.printf(
                template,
                1,
                productName1,
                days1,
                totalSales1Rounded,
                averageSales1Rounded
        );

        String productName2 = "laptop";
        int days2 = 7;
        int quantity2 = 1;
        double price2 = 10486.85;

        double totalSales2 = quantity2 * price2;
        double totalSales2Rounded = Math.round(totalSales2 * 100.0) / 100.0;

        double averageSales2 = totalSales2 / days2;
        double averageSales2Rounded = Math.round(averageSales2 * 100.0) / 100.0;

        System.out.printf(
                template,
                2,
                productName2,
                days2,
                totalSales2Rounded,
                averageSales2Rounded
        );
    }

}
