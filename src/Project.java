import java.util.ArrayList;

public abstract class Project implements Risky {

	private String title, objective;
	private long funds = 0;
	private ArrayList<Member> member;

	public Project(String title, String objective, long funds, ArrayList<Member> member) {
		super();
		this.title = title;
		this.objective = objective;
		this.funds = funds;
		this.member = new ArrayList<Member>();
	}

	public void addMember(Member m) {
		member.add(m);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public long getFunds() {
		return funds;
	}

	public void setFunds(long funds) {
		this.funds = funds;
	}

	public int size() {
		return member.size();
	}

}
