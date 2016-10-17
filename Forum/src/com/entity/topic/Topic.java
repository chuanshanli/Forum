package com.entity.topic;

import java.sql.Date;
import java.util.List;

public class Topic {
	private String userCreator;
	private Date date;
	private String nameTopic;
  private String dat;
	public String getDat() {
	return dat;
}

public void setDat() {
	this.dat = date.toString();
}

	public Topic(String userCreator, Date date, String nameTopic) {
		super();
		this.userCreator = userCreator;
		this.date = date;
		dat=date.toString();
		this.nameTopic = nameTopic;
	}

	public Topic() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameTopic+" "+this.userCreator+" "+this.date;
	}

	public String getUserCreator() {
		return userCreator;
	}

	public void setUserCreator(String userCreator) {
		this.userCreator = userCreator;
	}

	public long getDate() {
		return date.getTime();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNameTopic() {
		return nameTopic;
	}

	public void setNameTopic(String nameTopic) {
		this.nameTopic = nameTopic;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	private List<String> comments;

}
