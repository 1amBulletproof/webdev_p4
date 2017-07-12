/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandontarney.controller;

import com.brandontarney.bookingrate.Rates.HIKE;

/**
 *
 * @author Tarney
 */
public class HikeQueryParser {

    public static HIKE getHikeEnum(String queryString) throws BadQueryStringException {
        int queryStringOrder = 0;
        HIKE hikeEnum;

        String[] queryValues = queryString.split("&");
        String[] hike = queryValues[queryStringOrder].split("=");
        String hikeEnumStr = queryValues[1].toUpperCase();

        switch (hikeEnumStr) {
            case "HELLROARING":
                hikeEnum = HIKE.HELLROARING;
                break;
            case "GARDINER":
                hikeEnum = HIKE.GARDINER;
                break;
            case "BEATEN":
                hikeEnum = HIKE.BEATEN;
                break;
            default:
                throw new BadQueryStringException("Invalid (or no) hike value");

        }
        return hikeEnum;
    }
}
