import java.util.ArrayList;

public abstract class DeadlineProjects extends Project {

	private String deadLine;
	private final int maxMembers = 15;

	public DeadlineProjects(String title, String objective, long funds, ArrayList<Member> member, String deadLine) {
		super(title, objective, funds, member);
		this.deadLine = deadLine;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public void addMember(Member m) {
		if (this.size() < maxMembers) {
			addMember(m);
		}
	}
}
