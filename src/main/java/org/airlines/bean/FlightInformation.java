package org.airlines.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by pbaregal on 5/14/2019.
 */
@Entity
@Table(name="flight_information")
public class FlightInformation {
    @Id
    private String flightNo;
    private String airline;
    private String depCity;
    private String ariveCity;
    private String depDate;
    private String ariveDate;
    private String depTime;
    private String ariveTime;
    private String firstSeats;
    private String firstSeatsFare;
    private String businessSeat;
    private String businessSeatFare;

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getAriveCity() {
        return ariveCity;
    }

    public void setAriveCity(String ariveCity) {
        this.ariveCity = ariveCity;
    }

    public String getDepData() {
        return depDate;
    }

    public void setDepData(String depDate) {
        this.depDate = depDate;
    }

    public String getAriveDate() {
        return ariveDate;
    }

    public void setAriveDate(String ariveDate) {
        this.ariveDate = ariveDate;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getAriveTime() {
        return ariveTime;
    }

    public void setAriveTime(String ariveTime) {
        this.ariveTime = ariveTime;
    }

    public String getFirstSeats() {
        return firstSeats;
    }

    public void setFirstSeats(String firstSeats) {
        this.firstSeats = firstSeats;
    }

    public String getFirstSeatsFare() {
        return firstSeatsFare;
    }

    public void setFirstSeatsFare(String firstSeatsFare) {
        this.firstSeatsFare = firstSeatsFare;
    }

    public String getBusinessSeat() {
        return businessSeat;
    }

    public void setBusinessSeat(String businessSeat) {
        this.businessSeat = businessSeat;
    }

    public String getBusinessSeatFare() {
        return businessSeatFare;
    }

    public void setBusinessSeatFare(String businessSeatFare) {
        this.businessSeatFare = businessSeatFare;
    }
}
