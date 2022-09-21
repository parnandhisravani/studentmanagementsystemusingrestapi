package com.spring.student_management_system.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class StudentScoreCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Score_Id;

	@Column(name = "Physics")
	@NotNull
	private int physics;
	@Column(name = "Chemistry")
	@NotNull
	private int chemistry;
	@Column(name = "Mathematics")
	@NotNull
	private int mathematics;
	
	@ManyToOne
	@JoinColumn(name="Studid", referencedColumnName = "id")
	private Student student;

	public int getScore_Id() {
		return Score_Id;
	}

	public void setScore_Id(int score_Id) {
		Score_Id = score_Id;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMathematics() {
		return mathematics;
	}

	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}

