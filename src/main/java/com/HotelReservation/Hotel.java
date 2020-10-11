package com.HotelReservation;

public class Hotel {
	private String hotelName;
	private int weekdayRateForRegularCustomers;
	private int weekendRateForRegularCustomers;
	private int hotelRating;
	private int weekDayRateForRewardCustomers;
	private int weekendRateForRewardCustomers;
	public long totalRate;

	public long getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(long totalRate) {
		this.totalRate = totalRate;
	}

	public Hotel(String hotelName, int weekdayRateForRegularCustomers, int weekendRateForRegularCustomers,
			int hotelRating, int weekDayRateForRewardCustomers, int weekendRateForRewardCustomers) {
		super();
		this.hotelName = hotelName;
		this.weekdayRateForRegularCustomers = weekdayRateForRegularCustomers;
		this.weekendRateForRegularCustomers = weekendRateForRegularCustomers;
		this.hotelRating = hotelRating;
		this.weekDayRateForRewardCustomers = weekDayRateForRewardCustomers;
		this.weekendRateForRewardCustomers = weekendRateForRewardCustomers;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getWeekdayRateForRegularCustomers() {
		return weekdayRateForRegularCustomers;
	}

	public void setWeekdayRateForRegularCustomers(int weekdayRateForRegularCustomers) {
		this.weekdayRateForRegularCustomers = weekdayRateForRegularCustomers;
	}

	public int getWeekendRateForRegularCustomers() {
		return weekendRateForRegularCustomers;
	}

	public void setWeekendRateForRegularCustomers(int weekendRateForRegularCustomers) {
		this.weekendRateForRegularCustomers = weekendRateForRegularCustomers;
	}

	public int getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	public int getWeekDayRateForRewardCustomers() {
		return weekDayRateForRewardCustomers;
	}

	public void setWeekDayRateForRewardCustomers(int weekDayRateForRewardCustomers) {
		this.weekDayRateForRewardCustomers = weekDayRateForRewardCustomers;
	}

	public int getWeekendRateForRewardCustomers() {
		return weekendRateForRewardCustomers;
	}

	public void setWeekendRateForRewardCustomers(int weekendRateForRewardCustomers) {
		this.weekendRateForRewardCustomers = weekendRateForRewardCustomers;
	}
}
