
public class MilitaryProject extends DeadLineProject {
	private String password;
	private int teamNr = 0;

	public MilitaryProject(Manager manager, String title, double found, String deadLine, String password) {
		super(manager, title, found, deadLine);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTeamNr() {
		return teamNr;
	}

	public boolean setTeamNr(int teamNr) {
		if (teamNr < getMembers().size()) {
			this.teamNr = teamNr;
			return true;
		}
		return false;
	}

	@Override
	public double getRisk() {
		// TODO Auto-generated method stub
		return teamNr / password.length() / getFound();
	}
}
