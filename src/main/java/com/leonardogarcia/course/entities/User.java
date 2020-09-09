package com.leonardogarcia.course.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_User")
public class User implements Serializable {		
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userID;
	private String userName;
	private String userEmail;
	private String userPhone;
	private String userPassword;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	private List<Order> listOrder;
	
	public User() {		
	}

	public User(Long userID, String userName, String userEmail, String userPhone, String userPassword) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userPassword = userPassword;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public List<Order> getListOrder() {
		return listOrder;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + ", userPassword=" + userPassword + "]";
	}
	
	
}
