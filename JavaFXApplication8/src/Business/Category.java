package Business;

import java.util.ArrayList;

public class Category {

    String name;
    ArrayList<Attribute> attributeList;

    public Category(String name) {
        this.name = name;
        attributeList = new ArrayList<>();
    }

    public void addAttribute(Attribute attribute) {
        //Add an attribute to the product category via search
        attributeList.add(attribute);
    }

    public ArrayList<Attribute> getAllAttributes() {
        return attributeList;
    }

    public Attribute findAttributeByName(String attributeName) {
        for (Attribute attribute : attributeList) {
            if (attribute.getAttributeName().equals(attributeName)) {
                return attribute;
            }
        }
        //In this case, the attribute did not exist
        return null;
    }

}
