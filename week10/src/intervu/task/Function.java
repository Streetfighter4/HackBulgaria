package intervu.task;

public class Function {
	private String name;
	private String takeArgument;
	private String returnArgument;
	
	public Function(String name, String takeArgument, String returnArgument) {
		super();
		this.name = name;
		this.takeArgument = takeArgument;
		this.returnArgument = returnArgument;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTakeArgument() {
		return takeArgument;
	}
	public void setTakeArgument(String takeArgument) {
		this.takeArgument = takeArgument;
	}
	public String getReturnArgument() {
		return returnArgument;
	}
	public void setReturnArgument(String returnArgument) {
		this.returnArgument = returnArgument;
	}
	
	
}
