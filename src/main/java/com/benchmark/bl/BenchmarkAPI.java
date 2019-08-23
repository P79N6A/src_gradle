package com.benchmark.bl;

import a.i;
import retrofit2.http.GET;

public interface BenchmarkAPI {
    @GET(a = "https://aweme.snssdk.com/aweme/v1/device/benchmark/")
    i<BenchmarkResponse> getBenchmarks();
}
