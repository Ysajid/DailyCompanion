
package tasks;

import java.util.Date;

public class Task {
    
    private String title;
    private String description;
    private int weight = 1;
    private String dueDate;
    private String status;
    private Tag tags[];

    public Task(String title, String description, int weight, String dueDate, String status, Tag[] tags) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.weight = weight;
        this.tags = tags;
    }

    public Task() {
    }

    public Task(String title, String description, int weight){
        this.title = title;
        this.description = description;
        this.weight = weight;
    }
    public Task(String title, String description, String dueDate, Tag[] tags ){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.tags = tags;
    }
    public Task(String title, String descrption, String dueDate){
        this.title = title;
        this.description = descrption;
        this.dueDate = dueDate;
    }
    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public Tag[] getTags() {
        return tags;
    }
    
    public String getTagNames() {
        
        String ids = "";
        if(tags != null){
            for(Tag t : tags){
                ids += t.getName()+ ",";
            }
        return ids.substring(0,ids.length()-1);
        }
        return ids;
    }

    public String getTitle() {
        return title;
    }


    public int getWeight() {
        return weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
    
}
