package Product;

import java.util.HashMap;

public class Test_ProductAndAttributes {

    public static void main(String[] args) {
        CategoryList categoryList = new CategoryList();
        AttributeList pa = new AttributeList();

        //Create a new attribute
        pa.createNewAttribute("Weight", "int");
        pa.createNewAttribute("Size", "double");

        //Add a new category
        Category TV = new Category("TV");
        //Add the Weight attribute to the TV category
        TV.addAttribute(pa.getAttributeByName("Weight"));
        TV.addAttribute(pa.getAttributeByName("Size"));

        Product product = new Product("Samsung", TV);
        product.setAttribute("Weight", "30 kg");
        product.setAttribute("Size", "Very big");

        Product product2 = new Product("Grundig", TV);
        product2.setAttribute("Weight", "OMG SO HEAVY");
        HashMap<Attribute, String> map = product.getAllAttributeValues();
        for (Attribute a : map.keySet()) {
            System.out.println(a.getAttributeName() + ": " + map.get(a) + " (" + a.getAttributeType() + ")");
        }

        HashMap<Attribute, String> map2 = product2.getAllAttributeValues();
        for (Attribute a : map2.keySet()) {
            System.out.println(a.getAttributeName() + ": " + map2.get(a) + " (" + a.getAttributeType() + ")");
        }

    }

}
