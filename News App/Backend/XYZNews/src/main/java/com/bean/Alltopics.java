package com.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alltopics {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String topic;
	private String headline;
	private String image;
	private String description;
	@Column(name="likes")
	private int likes=0;
	@Column(name="dislikes")
	private int dislikes=0;
	private String comments;
	private Date date;
	private String Journalist;
	private String Country;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getJournalist() {
		return Journalist;
	}
	public void setJournalist(String journalist) {
		Journalist = journalist;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Alltopics [tid=" + tid + ", topic=" + topic + ", headline=" + headline + ", image=" + image
				+ ", description=" + description + ", likes=" + likes + ", dislikes=" + dislikes + ", comments="
				+ comments + ", date=" + date + ", Journalist=" + Journalist + ", Country=" + Country + "]";
	}

}
