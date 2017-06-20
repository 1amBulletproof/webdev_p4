/** CONTROLLER class 
 * @author Brandon Tarney
 * @since 6/15/2017
 */
package com.brandontarney.controller;


import java.time.LocalDate;

import com.brandontarney.bookingrate.BookingDay;
import com.brandontarney.bookingrate.Rates;

/** Controller (MVC) 
 *  - MVC Architecture: "Gui" = View, "Controller" = Controller, "Rates" = Model
 */
public class Controller {

    /** Compute the rate associated with a hike
     *  
     * @param rate      preliminary rate information of hike
     * @param duration  duration of hike
     * @param year      time of hike
     * @param month     time of hike
     * @param day       time of hike
     * 
     * @return          Final rate information for hike
     * @throws BadRateException 
     */
    public static Rates computeRate(
            Rates rate, int duration, int year, int month, int day)
            throws BadRateException {

        BookingDay startDate = new BookingDay(year, month, day);

        rate.setBeginDate(startDate);
        rate.setDuration(duration);
        
        LocalDate today = LocalDate.now();
        int todayDay = today.getDayOfMonth();
        int todayMonth = today.getMonthValue();
        int todayYear = today.getYear();
        
        BookingDay todayBookingDay = new BookingDay(todayYear, todayMonth, todayDay);

        if (rate.isValidDates() == false) {
            throw new BadRateException(rate.getDetails());
        } else if (startDate.before(todayBookingDay)) {
            throw new BadRateException("Start Date before today's date");
        }
        
        return rate;
    }

    /** Test the basic logic behind booking classes
     */
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
        for (int i = 0; i < possibleDurations.length; i++) {
            System.out.println("Can hike for " + possibleDurations[i] + " days");
        }

        System.out.println("Base Weekday Rate: $" + gardinerRate.getBaseRate());
        System.out.println("Base Weekend Rate: $" + gardinerRate.getPremiumRate());
        System.out.println("Valid trip dates? " + gardinerRate.isValidDates());
        System.out.println("Trip is " + gardinerRate.getNormalDays() + " weekdays and "
                + gardinerRate.getPremiumDays() + " weekend-days long");

        System.out.println("Cost of tour is $" + gardinerRate.getCost());

    }

}
