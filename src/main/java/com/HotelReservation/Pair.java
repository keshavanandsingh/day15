package com.HotelReservation;

public class Pair {
	private long cost;
	private Hotel cheapestHotel;
	public Pair(long cost, Hotel cheapestHotel) {
		super();
		this.cost = cost;
		this.cheapestHotel = cheapestHotel;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public Hotel getCheapestHotel() {
		return cheapestHotel;
	}
	public void setCheapestHotel(Hotel cheapestHotel) {
		this.cheapestHotel = cheapestHotel;
	}
}
