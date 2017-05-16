package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Ride;

public interface RideRepository {

	Ride createRide(Ride ride);
	
	List<Ride> getRides();

	Ride getRide(Integer id);

	Ride update(Ride ride);

	void updateRides(List<Object[]> pairs);

	void deleteRide(Integer id);
}