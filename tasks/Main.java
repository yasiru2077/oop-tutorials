package tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n--- TASK MANAGER ---");
            System.out.println("1. Add Task | 2. View Tasks | 3. Complete Task | 4. Delete Task | 5.Update | 6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Type (1: Work, 2: Personal): ");
                    int type = scanner.nextInt();
                    System.out.println("is Completed (1: true, 2: false): ");
                    boolean completed = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    manager.addTask(name, type, completed);
                    break;

                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter Id to complete: ");
                    manager.completeTask(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter ID to delete:");
                    manager.deleteTask(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Enter ID to Update");
                    manager.update(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
            }

        }

    }



}
