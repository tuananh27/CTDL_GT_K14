package com.anhvht2004110029.tuan03;

public class AccountDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account("Lê Văn A", "1234567890", "100000000", "khách hàng bình thường");

        account.intThenganhang();

        System.out.println("----------------");

        account = new Account("Lê Văn B", "9876541230", "1000000000", "VIP", "Mastercard Platinum");

        account.intThenganhang();
    }
    
}
