import java.util.ArrayList;
import java.util.Scanner;

public class EzeeShop {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String productNames[] = initProductNames();
        String keyword = in.nextLine();

        ArrayList<String> foundProducts = showProducts(productNames, keyword);

        for(String products : foundProducts) {
            System.out.println(products);
        }

        in.close();
    }

    static String[] initProductNames() {
        String productNames[] = {"Surf Excel", "Pepsi", "Coke", "Tide", 
                                "Amul Milk", "Amul Butter", "Amul Chocolate",
                                "Classmate Notebook", "Classmate Drawing Pencils"};

        return productNames;
    }

    static ArrayList<String> showProducts(String[] productNames, String keyword) {
        ArrayList<String> foundProducts = new ArrayList<String>();

        for(String productName : productNames) {

            if(productName.toLowerCase().contains(keyword.toLowerCase())) {
                foundProducts.add(productName);
            }
        }

        if(foundProducts.isEmpty()) {
            foundProducts.add("No matching results.");
        }

        return foundProducts;
    }
}