package com.emre.interfaceSegregation;

public class GooglePay implements UPIPayments,CashBackManager {

    public void payMoney() {

    }

    public void getScratchCard() {

    }

    public void getCashBackAsCreditBalance() {
      //this features is there in gpay
    }
}
