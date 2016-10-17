package com.forum.managebean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.forum.dao.Dao;
import com.forum.security.Util;

@ManagedBean(name = "daoController")
public class DaoController {
	@EJB
	Dao dao;

	public String add(User user) {
		 
		if (dao.addUser(user) == true) {
		
			return "success";
		} else {
			return "error";

		}
	}
}
