package com.fawry.solid.training.SingleResponsibility;

import com.fawry.solid.training.SingleResponsibility.dao.TransactionDao;
import com.fawry.solid.training.SingleResponsibility.model.OperationType;
import com.fawry.solid.training.SingleResponsibility.model.TransactionModel;
import com.fawry.solid.training.SingleResponsibility.model.TransactionStatus;

public class SingleResponsibility {

    public static void main(String[] args) {
	// write your code here
    }


    public static void doTransaction(){
        // validate
        TransactionDao.save(new TransactionModel(125,40.0, OperationType.DEBIT, TransactionStatus.PENDING));
        // call biller
        TransactionDao.update();

    }
}
