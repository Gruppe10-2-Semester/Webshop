package Product;

import java.util.ArrayList;
import java.util.List;

//A list of all attributes - Should be substituted with SQL database
public class AttributeList implements IAttributeList {

    //The list
    ArrayList<Attribute> attributeList;

    //Contructor
    public AttributeList() {
        attributeList = new ArrayList<>();
    }

    //Make a new attribute and put it in the list
    @Override
    public void createNewAttribute(String attributeName, String attributeType) {
        attributeList.add(new Attribute(attributeName, attributeType));
    }

    //Find a specific attribute, null if it dosen't exist
    @Override
    public Attribute getAttributeByName(String name) {
        for (Attribute a : attributeList) {
            if (a.getAttributeName().equals(name)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributeList;
    }

}
