package com.ss.android.ugc.aweme;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/IInterceptorService;", "", "interceptAndGetNewParams", "", "", "errorCode", "", "request", "Lcom/bytedance/retrofit2/client/Request;", "ssResponse", "Lcom/bytedance/retrofit2/SsResponse;", "shouldIntercept", "", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public interface o {
    @NotNull
    Map<String, String> interceptAndGetNewParams(int i, @Nullable Request request, @Nullable SsResponse<Object> ssResponse);

    boolean shouldIntercept(@NotNull Request request);
}
