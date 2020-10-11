package com.HotelReservation;

import static org.junit.Assert.*;
import org.junit.Test;

public class HotelTest {

	@Test
	public void when_SuccessfullyAddedHotel_shouldReturnTrue() {
		HotelReservation tester = new HotelReservation();
		boolean isHotelAdded = tester.addHotel("RandomHotel", 0, 0, 0, 0, 0);
		assertTrue(isHotelAdded);
	}

	@Test
	public void when_SearchedCheaptestHotel_shouldReturnCorrectValue() {
		HotelReservation tester = new HotelReservation();
		tester.addHotel("Lakewood", 110, 90, 3, 80, 80);
		tester.addHotel("Bridgewood", 160, 60, 4, 110, 50);
		tester.addHotel("Ridgewood", 220, 150, 5, 100, 40);
		assertEquals(220, tester.findCheapestHotel("10-02-1998", "11-02-1998").getCost());
	}

	public void when_SuccessfullyAddedWeekdayAndWeekendRates_shouldReturnTrue() {
		HotelReservation tester = new HotelReservation();
		tester.addHotel("Lakewood", 110, 90, 3, 80, 80);
		tester.addHotel("Bridgewood", 160, 60, 4, 110, 50);
		tester.addHotel("Ridgewood", 220, 150, 5, 100, 40);
		assertTrue(tester.addWeekdayandWeekendRates("Lakewood", 110, 90));
	}
}
