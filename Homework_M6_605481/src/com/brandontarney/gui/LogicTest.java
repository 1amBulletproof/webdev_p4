/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandontarney.gui;

import com.brandontarney.bookingrate.BookingDay;
import com.brandontarney.bookingrate.Rates;


/**
 *
 * @author Tarney
 */
public class LogicTest {
    
    public static void main(String[] args) {
        System.out.println("LogicTest Start");
        
        BookingDay birthday = new BookingDay(2017, 11, 5);
        System.out.println("Booking Date = " + birthday.toString());
        
        BookingDay endOfTour = new BookingDay(2017, 11, 8);
        
        Rates gardinerRate = new Rates(Rates.HIKE.GARDINER);
        Rates hellroaringRate = new Rates(Rates.HIKE.HELLROARING);
        Rates beatenRate = new Rates(Rates.HIKE.BEATEN);
        
        gardinerRate.setSeasonStart(1, 1);
        gardinerRate.setSeasonEnd(12, 30);
        gardinerRate.setBeginDate(birthday);
        gardinerRate.setEndDate(endOfTour);
        
        System.out.println("Birthday valid? " + birthday.isValidDate());
        System.out.println("Birhday before endOfTour? " + birthday.before(endOfTour));
        int[] possibleDurations = gardinerRate.getDurations();
        for (int i = 0; i < possibleDurations.length; i++)
        {
            System.out.println("Can hike for " + possibleDurations[i] + " days");
        }
        
        System.out.println("Base Weekday Rate: $" + gardinerRate.getBaseRate());
        System.out.println("Base Weekend Rate: $" + gardinerRate.getPremiumRate());
        System.out.println("Valid trip dates? " + gardinerRate.isValidDates());
        System.out.println("Trip is " + gardinerRate.getNormalDays() + " weekdays and " + 
                gardinerRate.getPremiumDays() + " weekend-days long");
        
        System.out.println("Cost of tour is $" + gardinerRate.getCost());
        
    }
    
}
