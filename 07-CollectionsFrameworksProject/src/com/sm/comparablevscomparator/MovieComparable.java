package com.sm.comparablevscomparator;

public class MovieComparable implements Comparable<MovieComparable> {

	private String mName;
	private double mRating;
	private int releaseYear;

	public MovieComparable(String mName, double mRating, int releaseYear) {
		this.mName = mName;
		this.mRating = mRating;
		this.releaseYear = releaseYear;
	}

	@Override
	public int compareTo(MovieComparable o) {
		return this.releaseYear - o.releaseYear;
	}

	public String getmName() {
		return mName;
	}

	public double getmRating() {
		return mRating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [mName=" + mName + ", mRating=" + mRating + ", releaseYear=" + releaseYear + "]";
	}

}
