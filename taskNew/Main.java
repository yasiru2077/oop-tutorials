package taskNew;

import tasks.TaskManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        TaskManagerNew Newmanager = new TaskManagerNew();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add task | 2. view tasks | 3. Complete task | 4. Delete tasks | 5. Update task | 6. Exits");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    System.out.println("Type (1: Work, 2: Personal): ");
                    int type = scanner.nextInt();
                    System.out.println("is Completed (1: true, 2: false): ");
                    boolean completed = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    Newmanager.addTask(name, type, completed);
                    break;
                case 2:
                    Newmanager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter Id to complete: ");
                    Newmanager.completeTask(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter ID to delete:");
                    Newmanager.deleteTask(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Enter ID to Update");
                    Newmanager.update(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;

            }
        }

    }

}
