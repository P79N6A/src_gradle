package com.mapbox.api.matching.v5;

import com.mapbox.api.matching.v5.models.k;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MapMatchingService {
    @GET(a = "matching/v5/{user}/{profile}/{coordinates}")
    b<k> getCall(@Header(a = "User-Agent") String str, @Path(a = "user") String str2, @Path(a = "profile") String str3, @Path(a = "coordinates") String str4, @Query(a = "access_token") String str5, @Query(a = "geometries") String str6, @Query(a = "radiuses") String str7, @Query(a = "steps") Boolean bool, @Query(a = "overview") String str8, @Query(a = "timestamps") String str9, @Query(a = "annotations") String str10, @Query(a = "language") String str11, @Query(a = "tidy") Boolean bool2, @Query(a = "roundabout_exits") Boolean bool3, @Query(a = "banner_instructions") Boolean bool4, @Query(a = "voice_instructions") Boolean bool5, @Query(a = "voice_units") String str12, @Query(a = "waypoints") String str13, @Query(a = "waypoint_names") String str14, @Query(a = "approaches") String str15);
}
