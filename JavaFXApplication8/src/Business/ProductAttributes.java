package Business;

import java.util.ArrayList;

//A list of all attributes
public class ProductAttributes {
    
    //The list
    ArrayList<Attribute> attributeList;
    
    //Contructor
    public ProductAttributes(){
        attributeList = new ArrayList<>();
    }
    
    //Make a new attribute and put it in the list
    public void createNewAttribute(String attributeName, String attributeType){
        attributeList.add(new Attribute(attributeName, attributeType));
    }
    
    //Find a specific attribute, null if it dosen't exist
    public Attribute getAttributeByName(String name){
        for (Attribute a : attributeList){
            if (a.getAttributeName().equals(name))
                return a;
        }
        return null;
    }
    
    
    //A single attribute, nested class
    class Attribute {
        
        String attributeName;
        String attributeType;
        
        Attribute(String attributeName, String attributeType){
            this.attributeName = attributeName;
            this.attributeType = attributeType;
        }
        
        public String getAttributeType(){
            return attributeType;
        }
        
        public String getAttributeName(){
            return attributeName;
        }
        
        
    }
    
}
