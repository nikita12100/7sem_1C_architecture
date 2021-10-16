package com.bank.bank.authentication;

public class AuthenticationImpl implements Authentication{

    @Override
    public boolean checkUser(String someInfo) {
        return false;
    }

    @Override
    public boolean checkUserAccount(String someInfo) {
        return false;
    }
}
