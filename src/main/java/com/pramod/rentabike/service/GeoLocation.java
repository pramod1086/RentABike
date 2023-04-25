//package com.pramod.rentabike.service;
//
//public class GeoLocation {
//
////    public double distanceTo(GeoLocation location, double radius) {
////        return Math.acos(Math.sin(radLat) * Math.sin(location.radLat) +
////                Math.cos(radLat) * Math.cos(location.radLat) *
////                        Math.cos(radLon - location.radLon)) * radius;
////    }
//public GeoLocation[] boundingCoordinates(double distance, double radius) {
//
//    if (radius < 0d || distance < 0d)
//        throw new IllegalArgumentException();
//
//    // angular distance in radians on a great circle
//    double radDist = distance / radius;
//
//    double minLat = radLat - radDist;
//    double maxLat = radLat + radDist;
//
//    double minLon, maxLon;
//    if (minLat > MIN_LAT && maxLat < MAX_LAT) {
//        double deltaLon = Math.asin(Math.sin(radDist) /
//                Math.cos(radLat));
//        minLon = radLon - deltaLon;
//        if (minLon < MIN_LON) minLon += 2d * Math.PI;
//        maxLon = radLon + deltaLon;
//        if (maxLon > MAX_LON) maxLon -= 2d * Math.PI;
//    } else {
//        // a pole is within the distance
//        minLat = Math.max(minLat, MIN_LAT);
//        maxLat = Math.min(maxLat, MAX_LAT);
//        minLon = MIN_LON;
//        maxLon = MAX_LON;
//    }
//
//    return new GeoLocation[]{fromRadians(minLat, minLon),
//            fromRadians(maxLat, maxLon)};
//}
//
//}
