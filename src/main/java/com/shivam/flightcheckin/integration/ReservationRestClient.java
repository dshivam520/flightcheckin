package com.shivam.flightcheckin.integration;

import com.shivam.flightcheckin.integration.dto.Reservation;
import com.shivam.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
	

}
