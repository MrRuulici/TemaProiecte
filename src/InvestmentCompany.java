import java.util.ArrayList;

public class InvestmentCompany {

	public static void main(String[] args) {

		Member m1 = new Member(20, "Raul");
		Member m2 = new Member(19, "Claudiu");
		Member m3 = new Member(22, "Dorel");
		Member m4 = new Member(24, "Matei");
		Member m5 = new Member(21, "Cornel");

		ArrayList<Member> members1 = new ArrayList<Member>();
		members1.add(m1);
		members1.add(m2);

		Project p1 = new CommercialProject("Exotic Cars", "Pentru firmele de inchiriat masini exotice", 10000, members1,
				"19.04.2022", 2);

		ArrayList<Member> members2 = new ArrayList<Member>();
		members1.add(m3);
		members1.add(m4);
		members1.add(m5);

		Project p2 = new MilitaryProject("Proiect militar", "Sa ne ferim de rusi", 2000, members2, "16.06.2022",
				"NuAiParolaMea123");

	}

}
