package com.pramod.rentabike.mapper;

import com.pramod.rentabike.model.CordinateReponse;
import com.pramod.rentabike.model.GeoLocation;
import com.pramod.rentabike.model.LocationResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GeoLocationToLocationMapper {
    public List<GeoLocation> getGeoLocationToLocationMapper(ArrayList<LocationResponse> locationResponse){
       return locationResponse.stream().map(location->{
           GeoLocation geoLocation = new GeoLocation();
           geoLocation.setLongitude(location.getLongitude());
           geoLocation.setLatitude(location.getLatitude());
           return geoLocation;
       }).collect(Collectors.toList());
    }

    public List<GeoLocation> getGeoCordinateMapper(ArrayList<CordinateReponse> locationResponse){
        return locationResponse.stream().map(location->{
            GeoLocation geoLocation = new GeoLocation();
            geoLocation.setLongitude(location.getLongitude());
            geoLocation.setLatitude(location.getLatitude());
            geoLocation.setName(location.getName());
            geoLocation.setFullAddress(location.getLabel());
            geoLocation.setType(location.getType());
            geoLocation.setDistance(location.getDistance());
            return geoLocation;
        }).collect(Collectors.toList());
    }
}
