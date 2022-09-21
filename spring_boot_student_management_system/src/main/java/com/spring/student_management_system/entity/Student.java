package com.spring.student_management_system.entity;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "First_Name")
	@NotNull
	private String firstname;
	@Column(name = "Last_Name")
	@NotNull
	private String lastname;
	@Column(name = "Date_Of_Birth")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateofbirth;
	@Column(name = "Email")
	@NotNull
	@Email
	private String email;
	@Column(name = "Mobile_NO")
	@NotNull
	private String mobileno;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
   private List<StudentScoreCard> studentscorecard  ;

	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public List<StudentScoreCard> getStudentscorecard() {
		return studentscorecard;
	}

	public void setStudentscorecard(List<StudentScoreCard> studentscorecard) {
		this.studentscorecard = studentscorecard;
	}
	
}

