package com.pramod.rentabike.controller;

import com.pramod.rentabike.model.City;
import com.pramod.rentabike.model.GeoLocation;
import com.pramod.rentabike.service.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DesignatedCenterInCityController
{
    @Autowired
    GeoLocationService geoLocationService;

    @GetMapping(value = "/v1/DesignatedCenterInCity", produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<GeoLocation> getDesignatedCenterInCity(@RequestParam(required = false, name = "cityId") int cityId){
        City city = new City();
        city.setId(cityId);
        return geoLocationService.getGeoLocationInCity(city);
    }
}
