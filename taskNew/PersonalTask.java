package taskNew;

public class PersonalTask extends Task {

    public PersonalTask(int id, String title, boolean isCompleted) {
        super(id, title, isCompleted);
    }

    @Override
    public String getTaskType() {
        return "PERSONAL";
    }
}
