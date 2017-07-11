import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Create an application which manages an inventory of products. Create a product class which has a price, id, 
 * and quantity on hand. Then create an inventory class which keeps track of various products and can sum up the inventory value.
 */

public class ProductInventoryTester {
	  // First read csv file for inventory
	// print out all inventory 
	// allow products to be added
	// allow quantity of products to be modified
	// 
	//
	  public static void main(String[] args) throws FileNotFoundException {
	        Scanner scanner = new Scanner("inventory.csv");
	        scanner.useDelimiter(",");
	        while(scanner.hasNext()){
	            System.out.print(scanner.next()+"|");
	        }
	        scanner.close();
	    }
}
