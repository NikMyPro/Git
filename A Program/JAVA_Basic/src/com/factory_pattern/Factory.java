package com.factory_pattern;

// Factory client code
public class Factory {
    public static void main(String args[]) {
        String country = "India";
        CurrencyInterface rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}
