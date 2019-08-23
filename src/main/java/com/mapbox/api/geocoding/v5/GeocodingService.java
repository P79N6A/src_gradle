package com.mapbox.api.geocoding.v5;

import com.mapbox.api.geocoding.v5.models.i;
import java.util.List;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GeocodingService {
    @GET(a = "/geocoding/v5/{mode}/{query}.json")
    b<List<i>> getBatchCall(@Header(a = "User-Agent") String str, @Path(a = "mode") String str2, @Path(a = "query") String str3, @Query(a = "access_token") String str4, @Query(a = "country") String str5, @Query(a = "proximity") String str6, @Query(a = "types") String str7, @Query(a = "autocomplete") Boolean bool, @Query(a = "bbox") String str8, @Query(a = "limit") String str9, @Query(a = "language") String str10, @Query(a = "reverseMode") String str11);

    @GET(a = "/geocoding/v5/{mode}/{query}.json")
    b<i> getCall(@Header(a = "User-Agent") String str, @Path(a = "mode") String str2, @Path(a = "query") String str3, @Query(a = "access_token") String str4, @Query(a = "country") String str5, @Query(a = "proximity") String str6, @Query(a = "types") String str7, @Query(a = "autocomplete") Boolean bool, @Query(a = "bbox") String str8, @Query(a = "limit") String str9, @Query(a = "language") String str10, @Query(a = "reverseMode") String str11);
}
