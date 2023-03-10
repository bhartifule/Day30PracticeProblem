package com.bridglabz.sql.MyMevanProject;

public class InvoiceGenerator {
	 private static final double Min_Cost_Per_KiloMeter = 10;
	    private static final double Cost_per_Time = 1;
	    private static final double Minimum_Fare = 5;

	    public double calculateFare(double distance, double time) {
	        double cost = distance * Min_Cost_Per_KiloMeter + time * Cost_per_Time;
	        if (cost < Minimum_Fare)
	            return Minimum_Fare;
	        return cost;
	    }

	    public double calculateFareForMultipleRides(Ride[] rides) {
	        double cost = 0;
	        for (Ride ride : rides) {
	            cost = cost + this.calculateFare(ride.distance, ride.time);
	        }
	        return cost;
	}

}
