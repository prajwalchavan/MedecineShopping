package com.praj.omss.entity;

import javax.persistence.*;

@Entity

@Table(name="UserInfo" )

public class User{
	
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="user_id")
	private int userid;
	@Column(name="first_name")
	private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="password")
    private String password;
    @Column(name="Mail_id")
    private String emailId;
    @Column(name="Mobile_no")
    private Long MobileNo;
    @Column(name="Address")
	private String Address;
 
    
//	public User(int userid, String firstName, String lastName, String address, String email, Long mobileNo,
//			String password, String string) {
//		this.userid = userid;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.password = password;
//		this.MobileNo = mobileNo;
//		this.Email = email;
//		this.Address = address;
//	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", emailId=" + emailId + ", MobileNo=" + MobileNo + ", Address=" + Address + "]";
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		MobileNo = mobileNo;
	}
	
}

