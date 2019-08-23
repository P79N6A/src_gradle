package com.ss.android.ugc.aweme.profile.api;

import a.i;
import com.ss.android.ugc.aweme.profile.model.CityListBean;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SelectCityApi {
    @GET(a = "/aweme/v1/hide/location/")
    i<String> hideLocation(@Query(a = "hide_location") int i);

    @GET(a = "/api/2/article/city/")
    i<CityListBean> queryCityList();
}
