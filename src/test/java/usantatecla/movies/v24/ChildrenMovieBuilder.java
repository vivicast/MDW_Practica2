package usantatecla.movies.v24;

public class ChildrenMovieBuilder {

	private String title;

	public ChildrenMovieBuilder() {
		title = "movieName";
	}
	
	public ChildrenMovieBuilder title(String title) {
		this.title = title;
		return this;
	}

	public Movie build() {
		return new ChildrenMovie(title);
	}
}
