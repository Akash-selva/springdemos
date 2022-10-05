package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	public int regno;
	public String feedback;
	public float ratings;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Feedback [regno=" + regno + ", feedback=" + feedback + ", ratings=" + ratings + "]";
	}
	
}
