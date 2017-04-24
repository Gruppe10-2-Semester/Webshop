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
public class ProductInformationManagement implements ProductManageable{
    
    private ProductCatalog productCatalog;
    
    public ProductInformationManagement() {
        productCatalog = new ProductCatalog();
    }

    @Override
    public void createNewProduct(String productName, Category category, int productID) {
        Product newProduct = new Product(productName, category, productID);
        productCatalog.addProduct(newProduct);
    }

    @Override
    public void createNewProductCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createNewCategoryAttribute(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String viewProductInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProduct(Product prodcut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
