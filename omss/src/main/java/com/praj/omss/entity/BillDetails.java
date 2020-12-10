package com.praj.omss.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "BillDetails")

public class BillDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bill_id")
	private int billid;
	@Column(name = "Order_id")
	private String orderId;
	@Column(name = "Bill_Date")
	private String BillDate;
	@Column(name = "Total_amt")
	private String totalAmount;
	@Column(name = "Billing_Address")
	private String BillingAddress;

	public BillDetails(int billid, String orderId, String billDate, String totalAmount, String billingAddress) {
		super();
		this.billid = billid;
		this.orderId = orderId;
		BillDate = billDate;
		this.totalAmount = totalAmount;
		BillingAddress = billingAddress;
	}

	public BillDetails() {
		super();

	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBillDate() {
		return BillDate;
	}

	public void setBillDate(String billDate) {
		BillDate = billDate;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getBillingAddress() {
		return BillingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		BillingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "BillDetails [billid=" + billid + ", orderId=" + orderId + ", BillDate=" + BillDate + ", totalAmount="
				+ totalAmount + ", BillingAddress=" + BillingAddress + "]";
	}
}
