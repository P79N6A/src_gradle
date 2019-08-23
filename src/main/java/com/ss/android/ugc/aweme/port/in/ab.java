package com.ss.android.ugc.aweme.port.in;

import com.google.gson.Gson;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/port/in/INetworkService;", "", "getOKHttpClient", "Lokhttp3/OkHttpClient;", "getRetrofitFactoryGson", "Lcom/google/gson/Gson;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface ab {
    @NotNull
    OkHttpClient getOKHttpClient();

    @NotNull
    Gson getRetrofitFactoryGson();
}
