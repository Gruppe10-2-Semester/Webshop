
package Business;

public class Attribute {
    
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
