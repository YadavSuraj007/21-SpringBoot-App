package com.nareshit.helloworl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/payment")
//http://localhost:8080/payment/creditcard==>paymentController payObj=ioc.getPaymentController();
public class PaymentController {

	//Credit Card Payment
	@RequestMapping(value="/creditcard")
	// http://localhost:8080/payment/creditcard==>payObj.creditCardPayment();
	public String creditCardPayment() {
		return "Reached to credit card Payment";
	}
	 // NetBankingPayment 
    @RequestMapping(value="/netBank")
    // http://localhost:8080/payment/creditcard==>payObj.netBankingPayment();
    public String netBankingPayment() {
    	return "Reached to Net Banking Payment";
    }

    // GooglePay Payment
    @RequestMapping(value="/Gpay")
 // http://localhost:8080/payment/creditcard==>payObj.gpay();
    public String Gpay() {
    	return "Reached to Google Pay Payment";
    }
    
    // PhonePay Payment
    @RequestMapping(value="/phonepay")
 // http://localhost:8080/payment/creditcard==>payObj.phonepay();
    public String phonepay() {
    	return "Reached to Phone Pay Payment";
    }
}
