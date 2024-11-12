public class Task {
    private int id;
    private String title;
    private String description;
    private String dueDate;
    private int priority;
    private String status;
    private int assignedTo;

    public Task(int id, String title, String description, String dueDate, int priority, String status, int assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
        this.assignedTo = assignedTo;
    }

    // Getters and Setters for Task fields
}
