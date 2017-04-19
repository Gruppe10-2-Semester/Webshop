/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Product.Product;

/**
 *
 * @author MadsNorby
 */
public interface ICatalog {
    
    public Product findProduct(int productID);
    public void deactivateProduct(int productID);
    public void addProduct(Product product);
    
}
