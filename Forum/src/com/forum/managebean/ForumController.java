package com.forum.managebean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import com.entity.topic.Comment;
import com.entity.topic.Topic;
import com.forum.dao.Dao;
import com.forum.security.Util;

@ManagedBean(name = "forumController")
@SessionScoped()
public class ForumController {
	@EJB
	Dao dao;

	public ForumController() {
		super();

	}

	private String topicName;
	private ArrayList<Topic> topics;
	private String comment;
	private List<Comment> comments;

	public List<Comment> getComments() {
		return dao.getComments(topicName);
	}

	public void setComments() {
		this.comments = dao.getComments(topicName);
	}

	private Topic choiceTopic;

	public List<Topic> getTopics() {
		return dao.listTopic();
	}

	public String setTopics() {
		this.topics = (ArrayList<Topic>) dao.listTopic();
		return "0k";
	}

	

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;

	}

	public String addTopic() {
		System.out.println("topiccc");
		if (true == dao
				.creatTopic(new Topic(Util.getUserName(), new Date(new java.util.Date().getTime()), topicName))) {
			this.comments = dao.getComments(topicName);
			return "success";
		}
		return "error";

	}

	public String back() {
		return "back";
	}

	public String refresh() {
		return "refresh";
	}

	public String lookTopic(String topicName) {

		System.out.println("............." + topicName);
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		this.topicName = topicName;
		this.comments = dao.getComments(topicName);
		return "comments";
	}

	public String addComment() {

		System.out.println("helllo");
		if (true == dao.addComment(this.comment, this.topicName, Util.getUserName())) {
			System.out.println("topicName:" + this.topicName + " " + "comment:" + this.comment);
			this.comments = dao.getComments(topicName);
			return "comments";
		} else {
			return "commentError";
		}
	}

	public String logout() {
		HttpSession session = Util.getSession();
		session.invalidate();
		System.out.println("bay bay");
		return "log";
	}
}
