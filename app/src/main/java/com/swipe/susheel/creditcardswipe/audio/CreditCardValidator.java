package com.swipe.susheel.creditcardswipe.audio;

/**
 * Created by Susheel on 9/25/2015.
 */
public class CreditCardValidator {


    public static boolean checkifvalid(String input_string){

              if(input_string.length()>22 && input_string.split(";",1).length-1 ==1 && input_string.split("=",1).length-1 ==1) {
                  String[] data_array = input_string.split(";");
                  String data_1 = data_array[1];
                  data_array = data_1.split("=");
                  String card_number = data_array[0];
                  String card_exp = data_array[1];
                  if(card_number.matches("[0-9]+")){

                  }
                  if(card_exp.length()<4){
                      return false;
                  }

                  return true;
              }
                else
                  return false;

    }


}
