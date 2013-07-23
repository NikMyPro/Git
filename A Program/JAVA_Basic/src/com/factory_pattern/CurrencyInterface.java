package com.factory_pattern;

/**
 * @ProjectName FactoryPattern
 * @PackageName 
 * @FileName Currency.java
 * @Author Gateway Technolabs Pvt Ltd.
 * @ModifiedDate Jul 22, 2013 12:25:26 PM
 * @Description 
 */
public interface CurrencyInterface {
    String getSymbol();
}

//Concrete Rupee Class code
class Rupee implements CurrencyInterface {
    @Override
    public String getSymbol() {
           return "Rs";
    }
}

//Concrete SGD class Code
class SGDDollar implements CurrencyInterface {
    @Override
    public String getSymbol() {
           return "SGD";
    }
}

//Concrete US Dollar code
class USDollar implements CurrencyInterface {
    @Override
    public String getSymbol() {
           return "USD";
    }
}
