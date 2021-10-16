package com.bank.bank.mobile;

import com.bank.bank.internet.InternetBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobileBankImpl implements MobileBank{

    @Autowired
    InternetBank internetBank;

    @Override
    public boolean tryLogin(String phone, String password) {
        return false;
    }

    @Override
    public void registration(String someFields) {

    }

    @Override
    public String getAccountInfo(Integer AccountId) {
        return null;
    }

    @Override
    public boolean transfer(Integer AccountIdFrom, Integer AccountIdTo) {
        return false;
    }

    @Override
    public String getSomeInfo(Integer AccountId) {
        return null;
    }
}
