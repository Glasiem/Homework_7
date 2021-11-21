package com.glasiem;

public class CLog implements Log {
    @Override
    public void print(Email email) {
        System.out.println("Email from '" + email.from + "' to '" + email.to + "' was send");
    }
}
