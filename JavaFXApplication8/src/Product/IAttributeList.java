/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.List;

/**
 *
 * @author MadsNorby
 */
interface IAttributeList {
    
    public Attribute getAttributeByName(String attributeName);
    public List<Attribute> getAttributes();
    public void createNewAttribute(String attributeName, String attributeType);
    
}
