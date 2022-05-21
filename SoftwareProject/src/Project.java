import java.util.HashSet;

public abstract class Project implements Risky {

	private Manager manager;
	private HashSet<Member> members;
	private String title;
	private double found;

	public Project(Manager manager, String title, double found) {
		this.manager = manager;
		members = new HashSet<Member>();
		members.add(manager);
		this.title = title;
		this.found = found;
	}

	public boolean addMember(Member m) {
		return members.add(m);
	}

	public boolean removeMember(Member m) {
		return members.remove(m);
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		members.remove(this.manager);
		this.manager = manager;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getFound() {
		return found;
	}

	public void setFound(double found) {
		this.found = found;
	}

	public HashSet<Member> getMembers() {
		return members;
	}

}
