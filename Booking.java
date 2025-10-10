package kz.ektu.Berik.Seterkhanuly.lab4.variant13;

public class Booking {
    private int id;
    private String customerName;
    private String roomType;
    private String checkInDate;

    public Booking(int id, String customerName, String roomType, String checkInDate) {
        this.id = id;
        this.customerName = customerName;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
    }
// private деректерді қолдану үшін
    public String getRoomType() {
        return roomType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }
    public String getBookingInfo() {
        return "ID: " + id +
                ", Клиент: " + customerName +
                ", Тип номера: " + roomType +
                ", Дата заезда: " + checkInDate;
    }
// броньдағы ақпаратты System.out.println(b) арқылы оп-оңай алу үшін
    @Override
    public String toString() {
        return getBookingInfo();
    }
}

