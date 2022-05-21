import java.util.ArrayList;

public class MilitaryProject extends DeadlineProjects {

	private String password;

	public MilitaryProject(String title, String objective, long funds, ArrayList<Member> member, String deadLine,
			String password) {
		super(title, objective, funds, member, deadLine);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRisk() {
		return this.size() / this.getPassword().length() / this.getFunds();
	}
}
