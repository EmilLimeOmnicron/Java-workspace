/*
 * 
 * 
 * Create an application which manages an inventory of products. Create a product class which has a price, id, 
 * and quantity on hand.
 */
public class Product {
	static double mPrice;
	static int mID, mQuantity;
	static String mName;
	
	//Start Accessors and Mutators
    public static double GetPrice() {
    	return mPrice;
    }
     
    public static void SetPrice(double price) { 
       mPrice = price;
    }
    
    public static int GetID() {
    	return mID;
    }
    
    public static void SetID(int id) {
    	mID = id;
    }
    
    public static int GetQuantity() {
    	return mQuantity;
    }
    
    public static void SetQuantity(int quantity) {
    	mQuantity = quantity;
    }
    
    public static void SetName(String name) {
    	mName = name;
    }
    
    public static String GetName() {
    	return mName;
    }
	//End Accessors and Mutators
    
    
    // Constructor
    Product(String name, double price, int id, int quantity) {
    	mName = name;
    	mPrice = price;
    	mID = id;
    	mQuantity = quantity;
    }
	
	
	
}
