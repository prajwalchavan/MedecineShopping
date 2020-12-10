package com.praj.omss.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_info")

public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="paymend_id")
	private int paymentId;
	@Column(name="Bill_ID")
	private String BillId;
	@Column(name="Date_Of_Payment")
	private String DateOfPayment;
	@Column(name="Card_no")
	private int cardNo;
	@Column(name="Total_Amt")
	private double totalAmount;
	@Column(name="Tax")
	private double taxAmount;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getBillId() {
		return BillId;
	}
	public void setBillId(String billId) {
		BillId = billId;
	}
	public String getDateOfPayment() {
		return DateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		DateOfPayment = dateOfPayment;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

}
