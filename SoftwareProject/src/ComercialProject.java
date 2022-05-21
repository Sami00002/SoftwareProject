import java.util.HashSet;

public class ComercialProject extends DeadLineProject {

	private int teamNr = 0;

	public ComercialProject(Manager manager, HashSet<Member> members, String title, double found, String deadLine) {
		super(manager, title, found, deadLine);
	}

	public double getMarketingFound() {
		return getFound() / 2;
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
		return teamNr * 3 / getMembers().size() / (getFound() - getMarketingFound());
	}

}
