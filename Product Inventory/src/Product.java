/*
 * 
 * 
 * Create an application which manages an inventory of products. Create a product class which has a price, id, 
 * and quantity on hand.
 */
public class Product {
	static double mPrice;
	int mID, mQuantity;
	
	
    public static double GetPrice() {
    	return mPrice;
    }
     
    public static void SetPrice(double price) { 
       mPrice = price;
    }
    
    pulic
    
    
	Product(double price, int id, int quantity){
	mPrice = price;
	mID = id;
	mQuantity = quantity;
   }
}
