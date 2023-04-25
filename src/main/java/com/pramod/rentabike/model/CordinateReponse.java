package com.pramod.rentabike.model;

import lombok.Data;

import java.util.ArrayList;


@Data
public class CordinateReponse {
    public double latitude;
    public double longitude;
    public String type;
    public String distance;
    public String name;
    public Object number;
    public Object postal_code;
    public Object street;
    public Double confidence;
    public String region;
    public String region_code;
    public String county;
    public String locality;
    public Object administrative_area;
    public Object neighbourhood;
    public String country;
    public String country_code;
    public String continent;
    public String label;

}
