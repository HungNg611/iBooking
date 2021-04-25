package com.ibooking.Model;

public class ReservationModel {
    private String HotelAddress;
    private int id;
    private String checkInDate;
    private String checkOutDate;

    /**
     * Constructs a ReservationModel object with id, HotelAddress, checkInDate, checkOutDate
     */
    public ReservationModel (int id, String HotelAddress, String checkInDate, String checkOutDate){
        this.id = id;
        this.HotelAddress = HotelAddress;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    //RESERVATION_TABLE [HotelAddress, id, CheckinDate, CheckoutDate]

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelAddress() {
        return HotelAddress;
    }

    public void setHotelAddress(String HotelAddress) {
        this.HotelAddress = HotelAddress;
    }

    public String getcheckInDate() {
        return checkInDate;
    }

    public void setcheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getcheckOutDate() {
        return checkInDate;
    }

    public void setcheckOutDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * @return a String of Reservation model
     */
    public String toString() {
        return "ReservationModel" +
                "ID = " + id +
                ", HotelAddress = '" + HotelAddress +
                ", Check In Date = " + checkInDate +
                ", Check Out Date = " + checkOutDate +
                '}';
    }

    public static void main(String[] args)
    {
        ReservationModel rev1 = new ReservationModel(1, "123 Baker Street, 123123", "12/12/2021", "12/15/2021");
        System.out.println(rev1.toString());
    }

    //expected output
    //ReservationModelID = 1, HotelAddress = '123 Baker Street, 123123, Check In Date = 12/12/2021, Check Out Date = 12/15/2021}
}
