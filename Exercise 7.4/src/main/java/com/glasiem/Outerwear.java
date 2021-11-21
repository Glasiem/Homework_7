package com.glasiem;

public class Outerwear implements IItem, IWhatColor, IWhatSize, IPromocodeAvailable, IDiscountAvailable{
    public void setPrice(double price) { }
    public void applyDiscount(String discount) { }
    public void applyPromocode(String promocode) { }
    public void setSize(byte size) { }
    public void setColor(byte color) { }
}
