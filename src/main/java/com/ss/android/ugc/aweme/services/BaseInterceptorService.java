package com.ss.android.ugc.aweme.services;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.o;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/BaseInterceptorService;", "Lcom/ss/android/ugc/aweme/IInterceptorService;", "()V", "interceptAndGetNewParams", "", "", "errorCode", "", "request", "Lcom/bytedance/retrofit2/client/Request;", "ssResponse", "Lcom/bytedance/retrofit2/SsResponse;", "", "shouldIntercept", "", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public class BaseInterceptorService implements o {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean shouldIntercept(@NotNull Request request) {
        Request request2 = request;
        if (PatchProxy.isSupport(new Object[]{request2}, this, changeQuickRedirect, false, 71338, new Class[]{Request.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{request2}, this, changeQuickRedirect, false, 71338, new Class[]{Request.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(request2, "request");
        return false;
    }

    @NotNull
    public Map<String, String> interceptAndGetNewParams(int i, @Nullable Request request, @Nullable SsResponse<Object> ssResponse) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), request, ssResponse}, this, changeQuickRedirect, false, 71339, new Class[]{Integer.TYPE, Request.class, SsResponse.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), request, ssResponse}, this, changeQuickRedirect, false, 71339, new Class[]{Integer.TYPE, Request.class, SsResponse.class}, Map.class);
        }
        Map<String, String> emptyMap = Collections.emptyMap();
        Intrinsics.checkExpressionValueIsNotNull(emptyMap, "Collections.emptyMap()");
        return emptyMap;
    }
}
