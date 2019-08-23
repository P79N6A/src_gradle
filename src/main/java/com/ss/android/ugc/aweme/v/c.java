package com.ss.android.ugc.aweme.v;

import android.net.Uri;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/monitor/ApiTimeMonitor;", "", "()V", "MONITOR_SERVICE", "", "monitor", "", "url", "info", "Lcom/bytedance/frameworks/baselib/network/http/BaseHttpRequestInfo;", "apiRetrofitMetrics", "Lcom/ss/android/ugc/aweme/monitor/ApiRetrofitMetrics;", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75986a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f75987b = new c();

    private c() {
    }

    public final void a(@NotNull String str, @NotNull a<?> aVar, @NotNull b bVar) {
        Iterator<Map.Entry<String, Long>> it2;
        String str2 = str;
        a<?> aVar2 = aVar;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2, bVar2}, this, f75986a, false, 59759, new Class[]{String.class, a.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2, bVar2}, this, f75986a, false, 59759, new Class[]{String.class, a.class, b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(aVar2, "info");
        Intrinsics.checkParameterIsNotNull(bVar2, "apiRetrofitMetrics");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wait_duration", aVar2.f19733d - aVar2.f19732c);
            jSONObject.put("interceptors_pre_duration", aVar2.f19734e - aVar2.f19733d);
            jSONObject.put("request_duration", aVar2.f19735f - aVar2.f19734e);
            jSONObject.put("read_response_duration", aVar2.h - aVar2.f19735f);
            jSONObject.put("parse_response_duration", bVar2.h);
            jSONObject.put("interceptors_after_duration", bVar2.j);
            jSONObject.put("api_duration", bVar2.i - bVar2.f21929a);
            if (aVar2.u == 0) {
                if (aVar2.j > 0) {
                    jSONObject.put("timing_dns", aVar2.j);
                }
                if (aVar2.k > 0) {
                    jSONObject.put("timing_connect", aVar2.k);
                }
                if (aVar2.l > 0) {
                    jSONObject.put("timing_ssl", aVar2.l);
                }
                if (aVar2.m > 0) {
                    jSONObject.put("timing_send", aVar2.m);
                }
                if (aVar2.q > 0) {
                    jSONObject.put("timing_waiting", aVar2.q);
                }
                if (aVar2.o > 0) {
                    jSONObject.put("timing_receive", aVar2.o);
                }
                if (aVar2.r > 0) {
                    jSONObject.put("timing_total", aVar2.r);
                }
            }
            Uri parse = Uri.parse(str);
            JSONObject jSONObject2 = new JSONObject();
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            jSONObject2.put("path", parse.getPath());
            jSONObject2.put("host", parse.getHost());
            if (bVar2.f75983d != null) {
                for (Map.Entry key : bVar2.f75983d.entrySet()) {
                    String str3 = ((String) key.getKey()) + "_duration";
                    Object value = it2.next().getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                    jSONObject.put(str3, ((Number) value).longValue());
                }
            }
            MonitorUtils.monitorEvent("api_time_log", null, jSONObject, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
