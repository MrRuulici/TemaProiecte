import java.util.ArrayList;

public class OpenSourceProject extends Project {

	private ArrayList<String> mailingList;

	public OpenSourceProject(String title, String objective, long funds, ArrayList<Member> member,
			ArrayList<String> mailingList) {
		super(title, objective, funds, member);
		this.mailingList = new ArrayList<String>();
	}

	@Override
	public double getRisk() {
		return this.size() / this.getFunds();
	}

	public boolean addMail(String mail) {
		return mailingList.add(mail);
	}
}
