package com.fawry.solid.training.SingleResponsibility.model;

import java.util.Date;

public class BillModel {

    private long id;

    private Date billDate;

    private long userId;

    private double amount;

    public BillModel(long id, Date billDate, long userId, double amount) {
        this.id = id;
        this.billDate = billDate;
        this.userId = userId;
        this.amount = amount;
    }

    public BillModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BillModel{" +
                "id=" + id +
                ", billDate=" + billDate +
                ", userId=" + userId +
                ", amount=" + amount +
                '}';
    }
}
