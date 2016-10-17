package com.forum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

import com.entity.topic.Comment;
import com.entity.topic.Topic;
import com.forum.managebean.User;
import com.forum.security.Util;

@Stateless
public class DaoImp implements Dao {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jsf";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";
	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement ps = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getUser(String username) {
		User u = null;
		String selectSQL = "SELECT u.name, u.password,g.name,t.name " + 
		                   "from user as u"+
				           " join town as t on (t.id=u.town_id)" +
		                   " join gender as g on (g.id=u.gender_id)" + 
				           " where u.name=?";

		try {
			ps = conn.prepareStatement(selectSQL);
			ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User(rs.getString("name"), rs.getString("password"), rs.getString("g.name"),
			    rs.getString("t.name"));
           }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public boolean addUser(User user) {
		String sql = " INSERT INTO  user (name, password,town_id,gender_id) " +
	                 "select ?,?,g.id,t.id from gender as g "+
				    "join town as t on (t.name=?)" + "where g.name=?";
		

		try {
			System.out.println(user.toString());
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getTown());
			ps.setString(4, user.getGender());
			
			ps.executeUpdate();
			
			HttpSession session = Util.getSession();
		
			session.setAttribute("username", user.getUsername());
			System.out.println("Record is inserted into DBUSER table!");
			return true;

		} catch (SQLException e) {
             e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean login(String username, String password) {
		User u = getUser(username);
		if (u != null) {
			if (u.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean creatTopic(Topic topic) {

		String sql = "insert into topic (topic_name,user_creatoror_id,date) select ?,u.id,? from user as u where u.name=? ";
		try {
			System.out.println(topic.toString());
			ps = conn.prepareStatement(sql);
			ps.setString(1, topic.getNameTopic());
			ps.setDate(2, new Date(topic.getDate()));
			ps.setString(3, topic.getUserCreator());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean addComment(String comment, String topicName, String username) {
		String sql = "INSERT INTO comments (coment,topic_id,user_id,date)" + "select ?,t.id,u.id,? from topic as t"
				+ " join user as u on (u.name=?) where t.topic_name=?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, comment);
			ps.setDate(2,new Date(new java.util.Date().getTime()));
			
			ps.setString(3, username);
			ps.setString(4, topicName);
			ps.executeUpdate();
			System.out.println("comment update...");
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Topic getTopic(String topicName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topic> listTopic() {
		String selectSQL = "SELECT t.topic_name,t.date,u.name  FROM topic as t,user as u where t.user_creatoror_id=u.id";
		ArrayList<Topic> topics = new ArrayList<>();

		ResultSet rs;
		try {
			PreparedStatement ps = conn.prepareStatement(selectSQL);
			rs = ps.executeQuery(selectSQL);
			while (rs.next()) {
				String topic = rs.getString("topic_name");
				Date date = rs.getDate("t.date");
				String username = rs.getString("u.name");
				topics.add(new Topic(username, date, topic));
			}
			return topics;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Comment> getComments(String topicName) {
		String sql="select u.name,c.coment,t.topic_name,c.date from user as u ,comments as c, topic as t where c.user_id=u.id and t.id=c.topic_id and topic_name=? ";
	
		ArrayList<Comment> comments=new ArrayList<Comment>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, topicName);
			System.out.println("topicnamme:"+topicName);
            ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				comments.add(new Comment(rs.getString("c.coment"),rs.getString("u.name"),topicName, rs.getDate("date")));
				System.out.println("_>> topic"+rs.getString("topic_name")+rs.getString("c.coment")+" "+rs.getString("u.name")+"  topicName"+ rs.getDate("date"));
			   
           }
			return comments;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	               
		
	}



}
