package coa;

import java.time.LocalDate;

public class Task {
	public String taskid;
	private String taskName;
	private LocalDate taskdate;
	private boolean isCompleted;
	public Task()
	{
		super();
	}
	public Task(String taskid, String taskName, LocalDate taskdate, boolean isCompleted) {
		super();
		this.taskid = taskid;
		this.taskName = taskName;
		this.taskdate = taskdate;
		this.isCompleted = isCompleted;
	}
	
	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskName=" + taskName + ", taskdate=" + taskdate + ", isCompleted="
				+ isCompleted + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Task thetask=null;
		boolean isEqual=false;
		if(obj instanceof Coach) {
			thetask=(Task) obj;
		}
		if((this.getTaskName()==thetask.getTaskName()) && (this.taskdate.equals(thetask.getTaskdate())) && (this.isCompleted()==thetask.isCompleted()))
				
		{
			isEqual=true;
		}
		return isEqual;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getTaskdate() {
		return taskdate;
	}
	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

}
