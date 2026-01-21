package taskNew;

public abstract class Task {
    private int id;
    private String title;
    private boolean isCompleted;

    public Task(int id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public abstract String getTaskType();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "[" + (isCompleted ? "X" : " ") + "] ID: " + id + " | " + getTaskType() + ": " + title;
    }


}
