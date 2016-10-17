package com.entity.topic;

import java.sql.Date;

public class Comment {

	 String comment;
	 String user;
	 String topicName;
	 String dat;
	 public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDat() {
		return dat;
	}
	public void setDat() {
		this.dat = date.toString();
	}
	Date date;
	public Comment(String comment, String user, String topicName, Date date) {
		super();
		this.comment = comment;
		this.user = user;
		this.topicName = topicName;
		this.date = date;
	}
	

}