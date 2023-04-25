package com.pramod.rentabike.model;

import lombok.Data;

@Data
public class GeoLocation {
    private int id;
    private double latitude;
    private double longitude;
    private String landMark;

    private String neighbourhood;

    private String fullAddress;

    private String name;
    private String type;
    private String distance;

}
