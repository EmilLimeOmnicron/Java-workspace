import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;

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

		Scanner sc = new Scanner(new File("inventory.csv"));
		sc.useDelimiter(",");

		List<Product> prod = new ArrayList<Product>();

		String[] nextLine;

		while (sc.hasNext())  {
			System.out.print(sc.next() + "|");
		}
		sc.close();


		
	}

}
