package com.mapbox.api.matrix.v1;

import com.mapbox.api.matrix.v1.a.c;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MatrixService {
    @GET(a = "directions-matrix/v1/{user}/{profile}/{coordinates}")
    b<c> getCall(@Header(a = "User-Agent") String str, @Path(a = "user") String str2, @Path(a = "profile") String str3, @Path(a = "coordinates") String str4, @Query(a = "access_token") String str5, @Query(a = "destinations") String str6, @Query(a = "sources") String str7);
}
