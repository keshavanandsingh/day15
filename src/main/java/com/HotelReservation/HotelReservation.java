package com.HotelReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	public List<Hotel> hotelList;
	private Pair p;

	public HotelReservation() {
		this.hotelList = new ArrayList<>();
	}

	public boolean addHotel(String hotelName, int weekdayRateForRegularCustomers, int weekendRateForRegularCustomers,
			int hotelRating, int weekDayRateForRewardCustomers, int weekendRateForRewardCustomers) {
		hotelList.add(new Hotel(hotelName, weekdayRateForRegularCustomers, weekendRateForRegularCustomers, hotelRating,
				weekDayRateForRewardCustomers, weekendRateForRewardCustomers));
		return true;
	}

	private void findCheapestHotel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date range to find hotel in format(dd-MMM-yyyy)");
		System.out.println("Enter start date");
		String startDate = sc.nextLine();
		System.out.println("Enter end date");
		String endDate = sc.nextLine();
		Hotel cheapestHotel = findCheapestHotel(startDate, endDate).getCheapestHotel();

	}

	public Pair findCheapestHotel(String startDate, String endDate) {
		Date start = null;
		Date end = null;
		try {
			start = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
			end = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		long numberOfDays = 1 + (end.getTime() - start.getTime()) / 1000 / 60 / 60 / 24;
		Hotel cheapestHotel = hotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRateForRegularCustomers))
				.findFirst().orElse(null);
		long totalRate = numberOfDays * cheapestHotel.getWeekdayRateForRegularCustomers();
		System.out.println("Cheapest hotel is : " + cheapestHotel.getHotelName() + " and the rate is : " + totalRate);
		p = new Pair(totalRate, cheapestHotel);
		return p;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program!");
		HotelReservation hotelReservationSystem = new HotelReservation();
		hotelReservationSystem.addHotel("Lakewood", 110, 90, 3, 80, 80);
		hotelReservationSystem.addHotel("Bridgewood", 160, 60, 4, 110, 50);
		hotelReservationSystem.addHotel("Ridgewood", 220, 150, 5, 100, 40);
		hotelReservationSystem.findCheapestHotel();
		hotelReservationSystem.addWeekdayandWeekendRates();

	}

	private void addWeekdayandWeekendRates() {
		for (int i = 0; i < hotelList.size(); i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the hotel name for which you want to add weekday and weekend rates :");
			String hotelName = sc.nextLine();
			System.out.println("Enter the weekday rates for " + hotelName);
			int weekdayRate = sc.nextInt();
			System.out.println("Enter the weekend rates for " + hotelName);
			int weekendRate = sc.nextInt();
			boolean check = addWeekdayandWeekendRates(hotelName, weekdayRate, weekendRate);
		}
	}

	public boolean addWeekdayandWeekendRates(String hotelName, int weekdayRate, int weekendRate) {
		boolean check = false;
		for (Hotel hotel : hotelList) {
			if (hotel.getHotelName().equalsIgnoreCase(hotelName)) {
				System.out.println("bdia");
				hotel.setWeekdayRateForRegularCustomers(weekdayRate);
				hotel.setWeekendRateForRegularCustomers(weekendRate);
				check = true;
				System.out.println("changes made successfully for " + hotelName);
			}
		}
		return check;
	}
}