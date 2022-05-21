
public abstract class DeadLineProject extends Project {

	private String deadLine;
	private final int MAX_NR = 15;

	public DeadLineProject(Manager manager, String title, double found, String deadLine) {
		super(manager, title, found);
		this.deadLine = deadLine;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public boolean addMember(Member m) {
		if (getMembers().size() == MAX_NR)
			return false;
		return getMembers().add(m);
	}
}
