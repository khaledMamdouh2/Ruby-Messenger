package model;

import java.io.Serializable;

/**
 * @author Mahmoud.Marzouk
 * @since 09/02/2018
 */
public class FriendshipCategory implements Serializable {

    private long categoryId;
    private String categoryName;

    public FriendshipCategory() {
    }
    
    public FriendshipCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public long getCategoryId() {
        return categoryId;
    }
    
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
