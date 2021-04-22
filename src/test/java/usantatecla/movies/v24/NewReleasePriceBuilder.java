package usantatecla.movies.v24;

public class NewReleasePriceBuilder {

	private String title;

	public NewReleasePriceBuilder() {
		title = "movieName";
	}
	
	public NewReleasePriceBuilder title(String title) {
		this.title = title;
		return this;
	}

	public Movie build() {
		return new NewReleasePrice(title);
	}
}
