package com.pramod.rentabike.service;

import com.pramod.rentabike.model.Bike;
import com.pramod.rentabike.model.GeoLocation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AvailableBikeAtCenterService {
    public List<Bike> getAvailableBikes(GeoLocation geoLocation) {
        List<Bike> bikes = new ArrayList<>();
        return bikes;


    }
}
