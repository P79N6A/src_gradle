package com.mapbox.api.tilequery;

import com.mapbox.geojson.FeatureCollection;
import java.util.List;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TilequeryService {
    @GET(a = "/v4/{mapIds}/tilequery/{query}.json")
    b<List<FeatureCollection>> getBatchCall(@Path(a = "mapIds") String str, @Path(a = "query") String str2, @Query(a = "access_token") String str3, @Query(a = "radius") Integer num, @Query(a = "limit") Integer num2, @Query(a = "dedupe") Boolean bool, @Query(a = "geometry") String str4, @Query(a = "layers") String str5);

    @GET(a = "/v4/{mapIds}/tilequery/{query}.json")
    b<FeatureCollection> getCall(@Path(a = "mapIds") String str, @Path(a = "query") String str2, @Query(a = "access_token") String str3, @Query(a = "radius") Integer num, @Query(a = "limit") Integer num2, @Query(a = "dedupe") Boolean bool, @Query(a = "geometry") String str4, @Query(a = "layers") String str5);
}
