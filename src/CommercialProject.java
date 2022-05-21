import java.util.ArrayList;

public class CommercialProject extends DeadlineProjects {

	private int teams = 0;

	public CommercialProject(String title, String objective, long funds, ArrayList<Member> member, String deadLine,
			int teams) {
		super(title, objective, funds, member, deadLine);
		this.teams = teams;
	}

	public int getTeams() {
		return teams;
	}

	public void setTeams(int teams) {
		if (this.size() > teams)
			this.teams = teams;

	}

	public double getRisk() {
		return (this.getTeams() * 3) / this.size() / (this.getFunds() / 2);
	}

}
