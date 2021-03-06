package com.ems.entity;
// Generated Aug 11, 2019 12:49:44 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DeptManager generated by hbm2java
 */
@Entity
@Table(name = "dept_manager", catalog = "employees")
public class DeptManager implements java.io.Serializable {

	private DeptManagerId id;
	private Departments departments;
	private Employees employees;
	private Date fromDate;
	private Date toDate;

	public DeptManager() {
	}

	public DeptManager(DeptManagerId id, Departments departments, Employees employees, Date fromDate, Date toDate) {
		this.id = id;
		this.departments = departments;
		this.employees = employees;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false)),
			@AttributeOverride(name = "deptNo", column = @Column(name = "dept_no", nullable = false, length = 4)) })
	public DeptManagerId getId() {
		return this.id;
	}

	public void setId(DeptManagerId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_no", nullable = false, insertable = false, updatable = false)
	public Departments getDepartments() {
		return this.departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false)
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "from_date", nullable = false, length = 10)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", nullable = false, length = 10)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
