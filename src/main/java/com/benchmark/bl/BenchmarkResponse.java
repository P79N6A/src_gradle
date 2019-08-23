package com.benchmark.bl;

import android.support.annotation.Keep;
import com.benchmark.Benchmark;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

@Keep
public class BenchmarkResponse extends BaseResponse {
    @SerializedName("benchmarks")
    public List<Benchmark> benchmarks;
}
