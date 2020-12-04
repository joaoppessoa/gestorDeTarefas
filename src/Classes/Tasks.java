package Classes;

public class Tasks {
    private int id;
    private String title;
    private String description;
    private int status;
    private int priorities;

    public Tasks(int id, String title, String description, int status, int priorities){ 
       this.setId(id);
       this.setTitle(title);
       this.setDescription(description);
       this.setStatus(status);
       this.setPriorities(priorities);
    }

    public void setId(int id){
        this.id = id; 
    }
    public void setTitle(String title){
        this.title = title; 
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setStatus(int status){
        this.status = status; 
    }
    public void setPriorities(int priorities){
        this.priorities = priorities; 
    }

    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title; 
    }
    public String getDescription(){
        return this.description;
    }
    public int getStatus(){
        return this.status;
    }
    public int getPriorities(){
        return this.priorities; 
    }

}