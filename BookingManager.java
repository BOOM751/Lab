package kz.ektu.Berik.Seterkhanuly.lab4.variant13;

import java.util.*;

public class BookingManager {
    private static List<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        // объектерді қосамыз
        bookings.add(new Booking(1, "Арман Приманов", "Стандарт", "2025-10-05"));
        bookings.add(new Booking(2, "Нурай Ибраева", "Люкс", "2025-10-02"));
        bookings.add(new Booking(3, "Ерлан Абдиров", "Стандарт", "2025-10-07"));

        System.out.println("Все бронирования:");
        for (Booking b : bookings) {
            System.out.println(b);
        }

        System.out.println("\n Поиск бронирования клиента 'Арман Приманов':");
        Booking found = findBookingByCustomer("Арман Приманов");

        System.out.println("\n Бронирования типа 'Стандарт':");
        List<Booking> standardBookings = getBookingsByRoomType("Стандарт");
        for (Booking b : standardBookings) {
            System.out.println(b);
        }

        System.out.println("\n Сортировка бронирований по дате:");
        sortBookingsByDate();
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
// equalsIgnoreCase() әріптердің үлкен кішісіне мән бермес үшін
    public static Booking findBookingByCustomer(String customerName) {
        for (Booking booking : bookings) {
            if (booking.getCustomerName().equalsIgnoreCase(customerName)) {
                System.out.println(booking);
                return booking;
            }
        }
        return null;
    }

    public static List<Booking> getBookingsByRoomType(String roomType) {
        List<Booking> result = new ArrayList<>();
        for (Booking b : bookings) {
            if (b.getRoomType().equalsIgnoreCase(roomType)) {
                result.add(b);
            }
        }
        return result;
    }

    public static void sortBookingsByDate() {
        Collections.sort(bookings, new Comparator<Booking>() {
            @Override
            public int compare(Booking b1, Booking b2) {
                return b1.getCheckInDate().compareTo(b2.getCheckInDate());
            }
        });
    }
}

