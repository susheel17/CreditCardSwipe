package com.swipe.susheel.creditcardswipe.audio;

/**
 * Created by Susheel on 9/25/2015.
 */
public class CreditCardValues {

    private String creditcardnumber;
    private String expiration_date;

    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public static CreditCardValues processdata(String data){

        CreditCardValues creditCardValues = new CreditCardValues();
        String[] data_array = data.split(";");
        String data_1 = data_array[1];
        data_array = data_1.split("=");
        String card_number = data_array[0];
        String card_exp = data_array[1].substring(0, 4);
        card_exp = card_exp.substring(2, 4)+"/"+card_exp.substring(0, 2);
        creditCardValues.setCreditcardnumber(card_number);
        creditCardValues.setExpiration_date(card_exp);
        return  creditCardValues;
    }




}
