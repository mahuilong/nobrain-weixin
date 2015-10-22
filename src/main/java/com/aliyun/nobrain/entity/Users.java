package com.aliyun.nobrain.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Users")
public class Users { 
	 @XmlElement(name = "User") 
private List<User> users; 

public List<User> getUsers() { 
return users; 
	 } 
public void setUsers(List<User> users) { 
this.users = users; 
	 } 
}
