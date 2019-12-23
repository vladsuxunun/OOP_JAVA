public class Cource {
	private String name;
	private String description;
	private int credits;
	private String prerequisite;

	public Cource(String name, String description, int credits, String prerequisite) {
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.prerequisite = prerequisite;
	}

	public String getInfo() {

		return name + description + credits + prerequisite;
	}
}
