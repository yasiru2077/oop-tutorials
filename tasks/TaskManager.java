package tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();
    private int nextId =1;

    public void addTask(String title,int type, boolean isCompleted){
        Task newTask = (type == 1) ? new WorkTask(nextId++,title,isCompleted) : new PersonalTask(nextId++,title,isCompleted);
        tasks.add(newTask);
        System.out.println("Task added successfully.");
    }

    public void listTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks found.");
            return;
        }
        for (Task t:tasks){
            System.out.println(t);
        }
    }

    public void completeTask(int id){
        for (Task t:tasks){
            if (t.getId() ==id){
                t.setCompleted(true);
                System.out.println("Task marked as complete");
                return;
            }
        }
        System.out.println("Task ID not found.");
    }

    public void deleteTask(int id){
        tasks.removeIf(t->t.getId()==id);
        System.out.println("Task deleted.");
    }

}
