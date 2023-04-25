package com.pramod.rentabike.web;


import com.google.gson.Gson;
import com.pramod.rentabike.model.GeoLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

@Component
public class HttpClientService {

    @Autowired
    GeoLocationClient geoLocationClient;
    public <T> T getObjectFromResponse(HttpResponse<String> httpResponse, Class<T> reponseClass){
      return new Gson().fromJson(httpResponse.body(), reponseClass);
    }

    public HttpResponse<String> getGeoLocation(GeoLocation geoLocation, String url) throws IOException, URISyntaxException, InterruptedException {
      return   geoLocationClient.postRequest(url,"");
    }

//    public ArrayList<LocationResponse> getGeoLocation(GeoLocation geoLocation,String url) throws IOException, URISyntaxException, InterruptedException {
//        HttpResponse<String> httpResponse = geoLocationClient.postRequest(url,"");
//
//        Reponse reponse = getObjectFromResponse(httpResponse);
//        return reponse.getData();
//    }



}
