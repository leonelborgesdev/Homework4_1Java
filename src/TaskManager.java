import java.util.List;

public class TaskManager {
    private List<String> taskList;

    public TaskManager(List<String> taskList) {
        this.taskList = taskList;
    }

    public void AddTask(String task){
        this.taskList.add(task);
    }
}
