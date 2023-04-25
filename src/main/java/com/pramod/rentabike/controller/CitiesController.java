package com.pramod.rentabike.controller;

import com.pramod.rentabike.model.City;
import com.pramod.rentabike.service.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CitiesController {
    @Autowired
    GeoLocationService geoLocationService;

    @RequestMapping(value = "/v1/cities", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<City> getCityList() throws IOException, URISyntaxException, InterruptedException {
        return geoLocationService.getListOfCities();
    }



}
