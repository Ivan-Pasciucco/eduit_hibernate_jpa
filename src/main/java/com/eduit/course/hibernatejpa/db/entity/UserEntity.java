package com.eduit.course.hibernatejpa.db.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = UserEntity.TABLE_NAME)
public class UserEntity {

	public static final String TABLE_NAME = "users";

	@Id
	@GeneratedValue
	private Long Id;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastNane;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(name = "date_created", nullable = false)
	private Date DateCreated;
	@Column(name = "date_deleted", nullable = true)
	private Date DateDeleted;

	public UserEntity() {

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNane() {
		return lastNane;
	}

	public void setLastNane(String lastNane) {
		this.lastNane = lastNane;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateCreated() {
		return DateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		DateCreated = dateCreated;
	}

	public Date getDateDeleted() {
		return DateDeleted;
	}

	public void setDateDeleted(Date dateDeleted) {
		DateDeleted = dateDeleted;
	}

	public static String getTableName() {
		return TABLE_NAME;
	}

}
