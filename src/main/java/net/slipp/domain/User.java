package net.slipp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User extends AbstractEntity {	
	@Column(nullable=false, length=20, unique=true)
	@JsonProperty
	private String userId;
	
	@JsonProperty
	private String name;
	
	@JsonIgnore
	private String password;
	
	@JsonProperty
	private String email;	

	public void setUserId(String userId) {
		this.userId = userId;
	}	

	public String getUserId() {
		return userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean matchPassword(String newPassword) {
		if(newPassword == null) {
			return false;
		}
		
		return newPassword.equals(password);
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void update(User newUser) {
		this.password = newUser.password;
		this.name = newUser.name;
		this.email = newUser.email;		
	}
	
	public boolean matchId(Long newId) {
		if(newId == null) {
			return false;
		}
		return newId.equals(getId());
	}

	@Override
	public String toString() {
		return "User ["+super.toString()+", userId=" + userId + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}	
	
	
	
}
