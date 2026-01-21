package taskNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagerNew {

    private List<Task> tasks = new ArrayList<>();

    private int nextId = 1;

    public void addTask(String title, int type, boolean isCompleted) {
        Task newTask;
        if (type == 1) {
            newTask = new WorkTask(nextId++, title, isCompleted);
        } else {
            newTask = new PersonalTask(nextId++, title, isCompleted);
        }
        tasks.add(newTask);

        System.out.println("Task added successfully.");

    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void completeTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setCompleted(true);
                System.out.println("Task marked as complete");
                return;
            }
        }
        System.out.println("Task ID not found.");
    }

    public void deleteTask(int id) {

        tasks.removeIf(t -> t.getId() == id);
        System.out.println("Task deleted.");

    }

    public void update(int id) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getId() == id) {
                System.out.println("What is the typ ? ");
                int type = scanner.nextInt();
                System.out.println("is it completed");
                boolean isCompeleted = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("What is the title?");
                String title = scanner.nextLine();
                Task updateTask;
                if (type==1){
                    updateTask = new WorkTask(t.getId(),title,isCompeleted);
                }else{
                    updateTask = new PersonalTask(t.getId(),title,isCompeleted);
                }
                tasks.set(i,updateTask);
                System.out.println("Task updated.");
            }
        }
    }


}
