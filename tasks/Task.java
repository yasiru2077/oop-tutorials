package tasks;

public abstract class Task {
    private int id;
    private String title;
    private boolean isCompleted;
    public Task(int id,String title,boolean isCompleted){
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public abstract String getTaskType();

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCompleted(boolean isCompleted){
            this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "[" + (isCompleted ? "X" : " ") + "] ID: " + id + " | " + getTaskType() + ": " + title;
    }
}
