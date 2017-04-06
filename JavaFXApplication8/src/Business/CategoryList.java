package Business;

import java.util.ArrayList;

//List of all categories. Should be substituted with SQL database.
public class CategoryList {
    
    ArrayList<Category> categoryList;
    
    public CategoryList(){
        categoryList = new ArrayList<>();
    }
    
    //Add a new category to the list of categories
    public void addNewCategory(String categoryName){
        categoryList.add(new Category(categoryName));
    }
    
}
