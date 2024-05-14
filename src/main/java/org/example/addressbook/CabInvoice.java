package org.example.addressbook;


public class CabInvoice {

    final static int cost_per_Km = 10;
    final static int cost_per_min = 1;
    final int min_fare = 5;


    public int getCost_per_Km() {
        return cost_per_Km;
    }

    public int getCost_per_min() {
        return cost_per_min;
    }

    public int getMin_fare() {
        return min_fare;
    }

    public static double totalFareJourney(double km_distance,double min_travel){
        return (km_distance * cost_per_Km) + (min_travel * cost_per_min);
    }


}