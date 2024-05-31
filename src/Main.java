
/*

- Adding a new task
- Viewing all tasks
- Marking a test as complete
- Deleting a task
- Exiting the application

 */

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("TODO List app!");
        System.out.println("Choose your option");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n\n\n\n\n" +
                    "1. Add task\n" +
                    "2. Remove a task\n" +
                    "3. Update a task\n" +
                    "4. Mark a task completed\n" +
                    "5. Display all task\n" +
                    "6. Exit\n");

            String option = scanner.nextLine();

            if (option.equals("6")) {
                System.out.println("Bye");
                break;
            } else if(option.equals("1")){
                Task task = new Task();

                System.out.print("Description: ");
                String description = scanner.nextLine();
                task.setDescription(description);
                System.out.println(task.getDescription());

                LocalDate date = LocalDate.now();
                task.setDate(date);
                System.out.println(task.getDate());

                task.setCompleted(false);
                System.out.println("Completion status: " + task.isCompleted());
            }
        }
    }
}