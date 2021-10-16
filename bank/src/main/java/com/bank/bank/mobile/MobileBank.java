package com.bank.bank.mobile;

public interface MobileBank {

    void registration(String someFields);

    boolean tryLogin(String phone, String password);

    String getAccountInfo(Integer AccountId);

    boolean transfer(Integer AccountIdFrom, Integer AccountIdTo);

    String getSomeInfo(Integer AccountId);

}
