package com.revature.movies;

public class Anime {
	private String title;
	private float rating;
	private int yearReleased;
	


	public Anime(String title, float rating, int yearReleased) {
		this.title = title;
		this.rating = rating;
		this.yearReleased = yearReleased;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	@Override
	public String toString() {
		return "Anime [title=" + title + ", rating=" + rating + ", yearReleased=" + yearReleased + "]";
	}
	
}
