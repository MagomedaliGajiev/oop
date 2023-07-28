package isp1.pay.impl;

import isp1.pay.PayCreditCard;
import isp1.pay.PayWebMoney;

// import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements PayWebMoney, PayCreditCard {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

}
