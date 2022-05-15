package com.devWall76.dsmovie.dto;

public class ScoreDTO {
	
	private Long movie;
	private String email;
	private Double score;
	public ScoreDTO() {
    }
	public Long getMovieId() {
		return movie;
	}
	public void setMovieId(Long movie) {
		this.movie = movie;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
}
