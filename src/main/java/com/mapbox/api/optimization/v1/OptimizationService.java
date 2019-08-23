package com.mapbox.api.optimization.v1;

import com.mapbox.api.optimization.v1.models.e;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OptimizationService {
    @GET(a = "optimized-trips/v1/{user}/{profile}/{coordinates}")
    b<e> getCall(@Header(a = "User-Agent") String str, @Path(a = "user") String str2, @Path(a = "profile") String str3, @Path(a = "coordinates") String str4, @Query(a = "access_token") String str5, @Query(a = "roundtrip") Boolean bool, @Query(a = "radiuses") String str6, @Query(a = "bearings") String str7, @Query(a = "steps") Boolean bool2, @Query(a = "overview") String str8, @Query(a = "geometries") String str9, @Query(a = "annotations") String str10, @Query(a = "destination") String str11, @Query(a = "source") String str12, @Query(a = "language") String str13, @Query(a = "distributions") String str14);
}
