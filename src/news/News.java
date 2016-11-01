/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package news;

/**
 *
 * @author ysajid
 */
public class News {
    private String title;
    private String description;

    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
