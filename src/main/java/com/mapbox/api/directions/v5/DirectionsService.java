package com.mapbox.api.directions.v5;

import com.mapbox.api.directions.v5.a.al;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DirectionsService {
    @GET(a = "directions/v5/{user}/{profile}/{coordinates}")
    b<al> getCall(@Header(a = "User-Agent") String str, @Path(a = "user") String str2, @Path(a = "profile") String str3, @Path(a = "coordinates") String str4, @Query(a = "access_token") String str5, @Query(a = "alternatives") Boolean bool, @Query(a = "geometries") String str6, @Query(a = "overview") String str7, @Query(a = "radiuses") String str8, @Query(a = "steps") Boolean bool2, @Query(a = "bearings") String str9, @Query(a = "continue_straight") Boolean bool3, @Query(a = "annotations") String str10, @Query(a = "language") String str11, @Query(a = "roundabout_exits") Boolean bool4, @Query(a = "voice_instructions") Boolean bool5, @Query(a = "banner_instructions") Boolean bool6, @Query(a = "voice_units") String str12, @Query(a = "exclude") String str13, @Query(a = "approaches") String str14, @Query(a = "waypoint_names") String str15);
}
