package tasks;

public class WorkTask extends Task {

    public WorkTask(int id, String title, boolean isCompleted) {
        super(id, title, isCompleted);
    }

    @Override
    public String getTaskType() {
        return "WORK";
    }

}
