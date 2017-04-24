package Product;

import java.util.HashMap;

public class Product {

    String productName;
    Category category;
    int productID;
    HashMap<Attribute, String> attributeValues;

    //Constructor
    public Product(String productName, Category category, int productID) {
        this.productName = productName;
        this.category = category;
        this.productID = productID;
        attributeValues = new HashMap<>();

        //Here should be logic that can assign values to each attribute.        
        for (Attribute attribute : category.getAllAttributes()){
            //Put all the attributes in the attributeValues, with nulls.
            attributeValues.put(attribute, null);                 
        }
        
        
        //Test ----------------------------- 
//        System.out.println("Product '" + productName + "' created with attributes:");
//        for (Attribute a : category.getAllAttributes()) {
//            System.out.println(a.getAttributeName() + " " + a.getAttributeType());
//        }
        //End of test ----------------------

    }
    
    public void setAttribute(String attributeName, String attributeValue){
        Attribute attribute = category.findAttributeByName(attributeName);
        attributeValues.put(attribute, attributeValue);      
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public HashMap<Attribute, String> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(HashMap<Attribute, String> attributeValues) {
        this.attributeValues = attributeValues;
    }
    
    public HashMap<Attribute, String> getAllAttributeValues(){
        return attributeValues;
    }

}
