package com.fawry.solid.training.SingleResponsibility.model;

public class TransactionModel {

    private long userId;

    private double amount;

    private OperationType trxType;

    private TransactionStatus trxStatus;

    public TransactionModel() {
    }

    public TransactionModel( long userId, double amount, OperationType trxType, TransactionStatus trxStatus) {
        this.userId = userId;
        this.amount = amount;
        this.trxType = trxType;
        this.trxStatus = trxStatus;
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

    public OperationType getTrxType() {
        return trxType;
    }

    public void setTrxType(OperationType trxType) {
        this.trxType = trxType;
    }

    public TransactionStatus getTrxStatus() {
        return trxStatus;
    }

    public void setTrxStatus(TransactionStatus trxStatus) {
        this.trxStatus = trxStatus;
    }

    @Override
    public String toString() {
        return "TransactionModel{" +
                ", userId=" + userId +
                ", amount=" + amount +
                ", trxType=" + trxType +
                ", trxStatus=" + trxStatus +
                '}';
    }
}
