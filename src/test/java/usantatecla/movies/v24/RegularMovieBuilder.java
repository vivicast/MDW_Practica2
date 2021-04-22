package usantatecla.movies.v24;

public class RegularMovieBuilder {

	private String title;

	public RegularMovieBuilder() {
		title = "movieName";
	}
	
	public RegularMovieBuilder title(String title) {
		this.title = title;
		return this;
	}

	public Movie build() {
		return new RegularMovie(title);
	}
}
