package com.trials.javacallfromdmn;

import java.util.ArrayList;
import java.util.List;
import com.trials.javacallfromdmn.HolidayDTO;
import com.trials.javacallfromdmn.CurrencyDTO;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class JavaClass {

   public static String hello(String name){
       return "hello " + name;
   }
   
   
    
   
   public static HolidayDTO getholiday(String name){
        HolidayDTO holiday = new HolidayDTO();
        holiday.setCalendarDate(name);
        CurrencyDTO currency = new CurrencyDTO("USD", false, false);
        List<CurrencyDTO> list = new ArrayList<>();
        list.add(currency);
        holiday.setCurrencies(list);
       return holiday;
   }



}