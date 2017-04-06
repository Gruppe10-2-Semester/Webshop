package Business;

import Business.ProductAttributes.Attribute;
import java.util.HashMap;


public class Product {
    
    String productName;
    Category category;
    HashMap<String, String> attributes;
    
    public Product(String productName, Category category){
        this.productName = productName;
        this.category = category;
        
        //Here should be logic that can assign values to each attribute.
        System.out.println("Product '" + productName + "' created with attributes:");
        for (Attribute a : category.getAllAttributes()){
            System.out.println(a.getAttributeName() + " " + a.getAttributeType());
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
