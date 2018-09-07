/**
 * 
 */
package com.project.candid.Institute.Bean;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author mmanickam
 *
 */
/**
 * @author mmanickam
 *
 */
@Entity(name="Student")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdOn", "modifiedOn" }, allowGetters = true)

public class Student {

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="studentid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	@Column(name = "name")
	public String name;
	@NotNull
	@Column(name="primarymobile")
	public int mobileprimary;
	@Column(name="secondarymobile")
	public int mobilesecondary;
	@NonNull
	@Column(name="email")	
	public String email;
	@Column(name="gender")	
	public String gender;
	@Column(name="qualification")
	public String qualification;
	@Column(name="referraltype")
	public String ReefrralType;
	@Column(name="referralinfo")
	public String ReferralInfo;
	@Column(name="status")
	public String Status;
	@Column(name="comments")
	public String comments;
	@Column(name="password")
	public String password;
	@Column(name="deletestatus")
	public boolean deleteStatus;
	@Column(name = "createdon", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	public Date createdOn;
	@Column(name="dob")
	public Date dob;
	@Column(name = "modifiedon", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	public Date modifiedOn;
	@Column(name = "addressline")
	public String addressline;

	/**
	 * @return the addressline
	 */
	public String getAddressline() {
		return addressline;
	}

	/**
	 * @param addressline
	 *            the addressline to set
	 */
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}

	/**
	 * @return the pinccode
	 */
	public int getPinccode() {
		return pinccode;
	}

	/**
	 * @param pinccode
	 *            the pinccode to set
	 */
	public void setPinccode(int pinccode) {
		this.pinccode = pinccode;
	}
	@Column(name = "city")
	public String city;
	@Column(name = "state")
	public String state;
	@Column(name = "country")
	public String Country;
	@Column(name = "pincode")
	public int pinccode;

	// @OneToOne
	// @JoinColumn(name = "studentaddressid")
	// public Address address;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the mobileprimary
	 */
	public int getMobileprimary() {
		return mobileprimary;
	}
	/**
	 * @param mobileprimary the mobileprimary to set
	 */
	public void setMobileprimary(int mobileprimary) {
		this.mobileprimary = mobileprimary;
	}
	/**
	 * @return the mobilesecondary
	 */
	public int getMobilesecondary() {
		return mobilesecondary;
	}
	/**
	 * @param mobilesecondary the mobilesecondary to set
	 */
	public void setMobilesecondary(int mobilesecondary) {
		this.mobilesecondary = mobilesecondary;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the reefrralType
	 */
	public String getReefrralType() {
		return ReefrralType;
	}
	/**
	 * @param reefrralType the reefrralType to set
	 */
	public void setReefrralType(String reefrralType) {
		ReefrralType = reefrralType;
	}
	/**
	 * @return the referralInfo
	 */
	public String getReferralInfo() {
		return ReferralInfo;
	}
	/**
	 * @param referralInfo the referralInfo to set
	 */
	public void setReferralInfo(String referralInfo) {
		ReferralInfo = referralInfo;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the deleteStatus
	 */
	public boolean isDeleteStatus() {
		return deleteStatus;
	}
	/**
	 * @param deleteStatus the deleteStatus to set
	 */
	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the modifiedOn
	 */
	public Date getModifiedOn() {
		return modifiedOn;
	}
	/**
	 * @param modifiedOn the modifiedOn to set
	 */
	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	

	
	
	
	
	

}
