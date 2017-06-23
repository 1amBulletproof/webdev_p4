/** CONTROLLER class
 *
 * @author Brandon Tarney
 * @since 6/15/2017
 */
package com.brandontarney.controller;

import com.brandontarney.bookingrate.BookingDay;
import com.brandontarney.bookingrate.Rates;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Controller (MVC) - MVC Architecture: "Gui" = View, "Controller" = Controller,
 * "Rates" = Model
 */
public class Controller {

    /**
     * Compute the rate associated with a hike
     *
     * @param rate preliminary rate information of hike
     * @param duration duration of hike
     * @param year time of hike
     * @param month time of hike
     * @param day time of hike
     *
     * @return Final rate information for hike
     * @throws BadRateException
     */
    public static String computeRate(
            Rates.HIKE hike, int duration, int year, int month, int day)
            throws BadRateException, IOException {

        /*
        modify your last homework to connect to a socket server to get the quote information instead of using the Rates and BookingDay classes.
The BHC server will be on <128.220.101.240>:20025. It expects data in the form of hike_id:begin_year:begin_month:begin_day:duration (e.g: 1:2008:7:1:3)
Gardiner Lake is hike_id 0, with durations of 3 or 5 days
Hellroaring Plateu is hike_id 1, with durations of 2, 3, or 4 days
Beaten Path is hike_id 2, with durations of 5 or 7 days
January is month 1, and the years are in four digits, and all values are separated by ":"s
The returned result will be the cost followed by a ":", followed by some text. If things go well, you'll get the cost and the text "Quoted Rate", if there is a problem, the cost will by -0.01 and the text will have some explanation. You will need to parse the return results and display them in your GUI. You are not responsible for the logic of the rate quote, as the server will handle it. All you are doing is designing the GUI client and then displaying the results from the server.
         */
        //TODO: new quotes from a server (create client)
        //1. Create a socket object
        String host = "128.220.101.240";
        int port = 20025;
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        
        try {
            socket = new Socket(host, port);

            //2. Create an output stream to send data to the socket
            out = new PrintWriter(socket.getOutputStream(), true);
            //3. Create an input stream to read server response from the socket
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: web6.jhuep.com");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for web6.jhuep.com");
            System.exit(1);
        }
        //4. Do I/O with the server using I/O streams
        //  - try wrapping the stream in a buffer/writer i.e. PrintWriter printOut = new PrintWriter(socket.getOUtputStream(), true);
        //      - BufferedReader bin = new BufferedReader(new InputStreamreader(socket.getInputStream));
        out.println("1:2017:7:1:3");
        String returnRate = in.readLine();
        
        //5. Close stuff
        out.close();
        in.close();
        socket.close();

        
        if (returnRate == "") {
            throw new BadRateException("No Rate Provided by Server");
        }
        
        return returnRate;

        /*
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
         */
    }

    /**
     * Test the basic logic behind booking classes
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
