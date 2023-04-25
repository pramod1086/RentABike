package com.pramod.rentabike.controller;

import com.pramod.rentabike.model.Bike;
import com.pramod.rentabike.model.City;
import com.pramod.rentabike.model.GeoLocation;
import com.pramod.rentabike.service.AvailableBikeAtCenterService;
import com.pramod.rentabike.service.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AvailableBikeAtCenterController {
    @Autowired
    AvailableBikeAtCenterService availableBikeAtCenterService;

    @RequestMapping(value = "/v1/availableBikes", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<Bike> getCityList(@RequestBody GeoLocation geoLocation){
        return availableBikeAtCenterService.getAvailableBikes(geoLocation);
    }


}
