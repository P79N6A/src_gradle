package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.client.a;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.feed.ag;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONObject;

public final class b {
    @Insert
    @TargetClass
    static Response a(CallServerInterceptor callServerInterceptor, a aVar) throws IOException {
        String str;
        Request request = (Request) (com.ss.android.g.a.a() ? callServerInterceptor.f21824d : callServerInterceptor.f21822b);
        if (ag.i().f3142b) {
            ag i = ag.i();
            if (PatchProxy.isSupport(new Object[]{request}, i, ag.f3141a, false, 40171, new Class[]{Request.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{request}, i, ag.f3141a, false, 40171, new Class[]{Request.class}, Void.TYPE);
            } else if (i.q <= 0 && request.getPath().contains("/aweme/v1/feed/")) {
                i.q = SystemClock.uptimeMillis();
            }
        }
        try {
            return aVar.a();
        } catch (Exception e2) {
            if (request != null) {
                com.ss.android.ugc.aweme.v.a aVar2 = com.ss.android.ugc.aweme.v.a.f75979d;
                if (!PatchProxy.isSupport(new Object[]{request, e2}, aVar2, com.ss.android.ugc.aweme.v.a.f75976a, false, 59745, new Class[]{Request.class, Exception.class}, Void.TYPE)) {
                    Intrinsics.checkParameterIsNotNull(request, "request");
                    Intrinsics.checkParameterIsNotNull(e2, "ex");
                    ArrayList a2 = aVar2.a();
                    int hashCode = request.getPath().hashCode();
                    if (a2 != null && a2.contains(Integer.valueOf(hashCode))) {
                        try {
                            if (e2 instanceof com.bytedance.frameworks.baselib.network.http.a.b) {
                                str = "status_code=" + ((com.bytedance.frameworks.baselib.network.http.a.b) e2).getStatusCode() + ",message=" + e2.getMessage();
                            } else if (e2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.a.a) {
                                str = "status_code=" + ((com.bytedance.frameworks.baselib.network.http.cronet.a.a) e2).getStatusCode() + ",message=" + e2.getMessage() + ",traceCode=" + ((com.bytedance.frameworks.baselib.network.http.cronet.a.a) e2).getTraceCode() + ",requestLog=" + ((com.bytedance.frameworks.baselib.network.http.cronet.a.a) e2).getRequestLog() + ",requestInfo=" + com.ss.android.ugc.aweme.v.a.f75977b.toJson((Object) ((com.bytedance.frameworks.baselib.network.http.cronet.a.a) e2).getRequestInfo());
                            } else {
                                str = e2.getMessage();
                            }
                            if (str == null) {
                                str = "";
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("path", request.getPath());
                            jSONObject.put("response", str);
                            jSONObject.put("request", com.ss.android.ugc.aweme.v.a.f75977b.toJson((Object) request));
                            n.b(com.ss.android.ugc.aweme.v.a.f75978c, "", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{request, e2}, aVar2, com.ss.android.ugc.aweme.v.a.f75976a, false, 59745, new Class[]{Request.class, Exception.class}, Void.TYPE);
                }
            }
            throw e2;
        }
    }
}
