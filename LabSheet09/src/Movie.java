
public class Movie {
	private String id;
	private String name;
	private Director director;

	Movie(String id, String name, Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	
	Movie() {
		this.id = null;
		this.name = null;
		this.director = null;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Director getDirector() {
		return this.director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String toString() {
		return this.id + " " + this.name + " direct by " + this.director;
	}
}
