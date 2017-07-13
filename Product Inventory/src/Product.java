/*
 * 
 * 
 * Create an application which manages an inventory of products. Create a product class which has a price, id, 
 * and quantity on hand.
 */
public class Product {
	private  String mPrice, mID, mQuantity, mName;
	
	//Start Accessors and Mutators
    public String GetName() {
    	return mName;
    }
    
    public void SetName(String name) {
    	mName = name;
    }
    public String GetPrice() {
    	return mPrice;
    }
     
    public void SetPrice(String price) { 
       mPrice = price;
    }
    
    public String GetID() {
    	return mID;
    }
    
    public void SetID(String id) {
    	mID = id;
    }
    
    public String GetQuantity() {
    	return mQuantity;
    }
    
    public void SetQuantity(String quantity) {
    	mQuantity = quantity;
    }

	//End Accessors and Mutators
    
    
    // Constructor
  /*  Product(String name, String price, String id, String quantity) {
    	mName = name;
    	mPrice = price;
    	mID = id;
    	mQuantity = quantity;
    }
	*/
    public String toString() {
    	return "{" + mName + "|" + mPrice + "|" + mID + "|" + mQuantity + "}";
    }
	
	
}
