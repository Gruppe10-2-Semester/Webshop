
package Business;



public class Test_ProductAndAttributes {


    public static void main(String[] args) {
        CategoryList categoryList = new CategoryList();
        ProductAttributes pa = new ProductAttributes();
        
        //Create a new attribute
        pa.createNewAttribute("Weight", "int");
        pa.createNewAttribute("Size", "double");
        
        //Add a new category
        Category TV = new Category("TV");
        //Add the Weight attribute to the TV category
        TV.addAttribute(pa.getAttributeByName("Weight"));
        TV.addAttribute(pa.getAttributeByName("Size"));
        
        Product product = new Product("Samsung", TV);
        
        
        
        
        
        
        
    }
    
}
