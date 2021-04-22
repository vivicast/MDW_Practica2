package usantatecla.movies.v24;

public class NewReleaseMovieBuilder {

	private String title;

	public NewReleaseMovieBuilder() {
		title = "movieName";
	}
	
	public NewReleaseMovieBuilder title(String title) {
		this.title = title;
		return this;
	}

	public Movie build() {
		return new NewReleaseMovie(title);
	}
}
