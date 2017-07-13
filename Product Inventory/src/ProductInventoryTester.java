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

		CSVReader reader = new CSVReader(new FileReader("inventory.csv"), ',');

		List<Product> prod = new ArrayList<Product>();

		// read line by line
		String[] nextLine;
//		(record = reader.readNext()) != null
		
		try {
			while ((nextLine = reader.readNext()) != null )  {
				Product p = new Product();
				p.SetName(nextLine[0]);
				p.SetPrice(nextLine[1]);
				p.SetID(nextLine[2]);
				p.SetQuantity(nextLine[3]);
				prod.add(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prod);

		
	}

}
