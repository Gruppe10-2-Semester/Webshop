package Business;

import Business.ProductAttributes.Attribute;
import java.util.ArrayList;


public class Category {
    
    String name;
    ArrayList<Attribute> attributeList;
    ProductAttributes productAttributes;
    
    public Category(String name){
        this.name = name;
        attributeList = new ArrayList<>();
    }
    
    public void addAttribute(Attribute attribute){
        //Add an attribute to the product category via search
        attributeList.add(attribute);              
    }
    
    public ArrayList<Attribute> getAllAttributes(){
        return attributeList;
    }

}
