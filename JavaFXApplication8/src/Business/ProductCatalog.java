/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Product.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MadsNorby
 */
public class ProductCatalog implements ICatalog {

    private List<Product> products;

    public ProductCatalog() {
        products = new ArrayList<Product>();
    }

    @Override
    public Product findProduct(int productID) {

        for (Product product : products) {
            if (product.getProductID() == productID) {
                return product;
            }
        }

        return null;
    }

    @Override
    public void deactivateProduct(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

}
