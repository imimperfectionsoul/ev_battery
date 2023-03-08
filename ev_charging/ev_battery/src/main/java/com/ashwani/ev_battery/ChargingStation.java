package com.ashwani.ev_battery;

import com.google.common.collect.Tables;

Identity
Tables(name = "charging_stations")
public class ChargingStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String pricing;

    private String imageUrl;

    // getters and setters
}

