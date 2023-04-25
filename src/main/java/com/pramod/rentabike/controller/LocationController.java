package com.pramod.rentabike.controller;

import com.pramod.rentabike.model.GeoLocation;
import com.pramod.rentabike.service.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class LocationController {
    @Autowired
    GeoLocationService geoLocationService;
    @RequestMapping(value = "/v1/locationCordinates", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<GeoLocation> getLocationBasedCordinates(
            @RequestParam("location") String location
    ) throws IOException, URISyntaxException, InterruptedException {
        GeoLocation geoLocation = new GeoLocation();
        return geoLocationService.getGeoLocation(geoLocation,location);
    }


    @RequestMapping(value = "/v1/cordinates", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<GeoLocation> getLocationCordinates(
            @RequestParam("latittute") String latittute,
            @RequestParam("longitude") String longitude
    ) throws IOException, URISyntaxException, InterruptedException {
        String location = latittute+","+longitude;
        GeoLocation geoLocation = new GeoLocation();
        return geoLocationService.getGeoLocationbasedOnCordinates(geoLocation,location);
    }

}
