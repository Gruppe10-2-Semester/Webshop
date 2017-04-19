/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Product.Category;
import Product.Product;

/**
 *
 * @author MadsNorby
 */
public interface ProductManageable {
    
    
    public void createNewProduct();
    public void createNewProductCategory();
    public void createNewCategoryAttribute(Category category);
    public void showAllProducts();
    public String viewProductInformation();
    public void addProduct(Product prodcut);
    
    
    
}
