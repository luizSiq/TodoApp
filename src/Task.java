
/*

- Adding a new task
- Viewing all tasks
- Marking a test as complete
- Deleting a task
- Exiting the application

 */
import java.time.LocalDate;

public class Task {

    private String description;
    private boolean isCompleted;
    private LocalDate date;

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void toggleCompleted() {
        this.isCompleted = !this.isCompleted;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

}
