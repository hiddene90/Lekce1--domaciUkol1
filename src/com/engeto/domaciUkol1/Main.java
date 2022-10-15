package com.engeto.domaciUkol1;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        String name = "Karel Mrkvička";
        LocalDate dateOfBirth = LocalDate.of(1967,10,1);
        int numOfContracts = 428;
        double soldInTons = 42.5;
        String city = "Praha";
        String SPZ = "3AC5949";
        double consumptionPer100km = 5.9;
        String IPv4 = "192.168.64.24";
        double averagePerContract = soldInTons/numOfContracts;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu "+ averagePerContract + "." );

    }
}
