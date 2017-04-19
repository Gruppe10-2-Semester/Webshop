package Product;

import java.util.HashMap;

public class Product {

    String productName;
    Category category;
    HashMap<Attribute, String> attributeValues;

    //Constructor
    public Product(String productName, Category category) {
        this.productName = productName;
        this.category = category;
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
    
    public HashMap<Attribute, String> getAllAttributeValues(){
        return attributeValues;
    }

}
