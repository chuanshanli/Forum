package com.forum.dao;


import java.util.List;

import javax.ejb.Local;

import com.entity.topic.Comment;
import com.entity.topic.Topic;
import com.forum.managebean.User;

@Local
public interface Dao {
	User getUser(String username);
	boolean addUser(User user);
    boolean login(String username,String password);
    boolean creatTopic(Topic topic);
    boolean  addComment(String comment,String topicName,String username);
    Topic getTopic(String topicName);
	List<Topic> listTopic();
	List<Comment> getComments(String topicName);
    
}