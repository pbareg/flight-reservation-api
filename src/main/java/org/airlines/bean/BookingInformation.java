package org.airlines.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by pbaregal on 5/14/2019.
 */
@Entity
@Table(name="booking_information")
public class BookingInformation {

    @Id
    String bookingId;
    String customerEmail;
    Integer noOfPassengers;
    String classType;
    Float totalFare;
    String seatNumber;
    String creditcardInfo;
    String srcCity;
    String destCity;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Integer getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(Integer noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Float getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Float totalFare) {
        this.totalFare = totalFare;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCreditcardInfo() {
        return creditcardInfo;
    }

    public void setCreditcardInfo(String creditcardInfo) {
        this.creditcardInfo = creditcardInfo;
    }

    public String getSrcCity() {
        return srcCity;
    }

    public void setSrcCity(String srcCity) {
        this.srcCity = srcCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }
}
