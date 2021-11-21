package com.glasiem;

public class Book implements IItem, IDiscountAvailable, IPromocodeAvailable {
    public void setPrice(double price) { }
    public void applyDiscount(String discount) { }
    public void applyPromocode(String promocode) { }
}
