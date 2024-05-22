public class Tasks {
  String taskTittle;
  String DueDate;
  int Status;
  public Tasks(){

  }
  public Tasks(String itemTittle, String DueDate, int Status){
    this.taskTittle = itemTittle;
    this.DueDate = DueDate;
    this.Status = Status;

  }

  public void setStatus(int status) {
      Status = status;
  }
  public void setDueDate(String dueDate) {
      DueDate = dueDate;
  }
  public void setTaskTittle(String taskTittle) {
      this.taskTittle = taskTittle;
  }

  //
  public String getDueDate() {
      return DueDate;
  }
  public int getStatus() {
      return Status;
  }
  public String getTaskTittle() {
      return taskTittle;
  }
  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return getTaskTittle() + "  "+ getDueDate() + "      "+ getStatus();
  }
}
