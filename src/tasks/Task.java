
package tasks;

import java.util.Date;

public class Task {
    
    private String title;
    private String description;
    private int type;
    private Date dueDate;
    private boolean remind = false;
    private String status;
    private int weight = 0;
    private Tag tags[];

    public Task(String title, String description, Date dueDate, boolean remind, String status, int weight, Tag[] tags) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.remind = remind;
        this.status = status;
        this.weight = weight;
        this.tags = tags;
    }

    public Task() {
    }

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }
    public Task(String title, String description, Date dueDate, Tag[] tags ){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.tags = tags;
    }
    public Task(String title, String descrption, Date dueDate, boolean remind){
        this.title = title;
        this.description = descrption;
        this.dueDate = dueDate;
        this.remind = remind;
    }
    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setRemind(boolean remind) {
        this.remind = remind;
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

    public void setType(int type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
    
}
