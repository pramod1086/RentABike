package com.pramod.rentabike.service;

import com.pramod.rentabike.mapper.GeoLocationToLocationMapper;
import com.pramod.rentabike.model.*;
import com.pramod.rentabike.web.HttpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Component
public class GeoLocationService {


    @Autowired
    private HttpClientService httpClientService;

    @Autowired
    GeoLocationToLocationMapper geoLocationToLocationMapper;
    public List<GeoLocation> getGeoLocation(GeoLocation geoLocation,String location) throws IOException, URISyntaxException, InterruptedException {
        StringBuilder url = new StringBuilder();
        String endpoint = "http://api.positionstack.com/v1/";
        StringBuilder queryParam = new StringBuilder();
        String accessValue = "f57ef458a433426415af37e5f523739d";
        queryParam.append("forward?access_key=").append(accessValue).append("&query=").append(location);
        url.append(endpoint).append(queryParam);
        HttpResponse<String> httpResponse = httpClientService.getGeoLocation(geoLocation,url.toString());
        Reponse response = httpClientService.getObjectFromResponse(httpResponse, Reponse.class);
        return geoLocationToLocationMapper.getGeoLocationToLocationMapper(response.getData());
    }
    public List<GeoLocation> getGeoLocationbasedOnCordinates(GeoLocation geoLocation,String location) throws IOException, URISyntaxException, InterruptedException {
        StringBuilder url = new StringBuilder();
        String endpoint = "http://api.positionstack.com/v1/";
        StringBuilder queryParam = new StringBuilder();
        String accessValue = "f57ef458a433426415af37e5f523739d";
        queryParam.append("reverse?access_key=").append(accessValue).append("&query=").append(location);
        url.append(endpoint).append(queryParam);
        HttpResponse<String> httpResponse = httpClientService.getGeoLocation(geoLocation,url.toString());
        CoordinateBasedResponse coordinateBasedResponse = httpClientService.getObjectFromResponse(httpResponse, CoordinateBasedResponse.class);
        return geoLocationToLocationMapper.getGeoCordinateMapper(coordinateBasedResponse.getData());
    }



    public List<GeoLocation> getGeoLocationInCity(City city){
        List<GeoLocation> geoLocation = new ArrayList();
        return geoLocation;

    }

    public List<City> getListOfCities() {
        List<City> listOfCity = new ArrayList();

        return listOfCity;
    }
}
