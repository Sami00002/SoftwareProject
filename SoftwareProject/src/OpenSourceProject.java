
public class OpenSourceProject extends DeadLineProject {
	private String mailingList;

	public OpenSourceProject(Manager manager, String title, double found, String deadLine, String mailingList) {
		super(manager, title, found, deadLine);
	}

	public String getMailingList() {
		return mailingList;
	}

	public void setMailingList(String mailingList) {
		this.mailingList = mailingList;
	}

	public double getRisk() {
		// TODO Auto-generated method stub
		return this.getMembers().size() / getFound();
	}
}
