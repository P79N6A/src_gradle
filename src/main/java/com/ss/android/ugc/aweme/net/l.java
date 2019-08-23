package com.ss.android.ugc.aweme.net;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.a.a;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.b.b;
import com.bytedance.ttnet.b.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.net.a.i;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class l implements r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56994a;

    private static void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f56994a, true, 60736, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f56994a, true, 60736, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            try {
                jSONObject2.put("nt_band_width", c.b().c());
                jSONObject2.put("cdn_nt_band_width", a.a().c());
                jSONObject2.put("cronet_open", com.bytedance.ttnet.config.a.a((Context) k.a()).g());
                TTNetInit.getTTNetDepend();
                jSONObject2.put("cronet_plugin_install", true);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(b bVar, JSONObject jSONObject) {
        b bVar2 = bVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{bVar2, jSONObject2}, null, f56994a, true, 60737, new Class[]{b.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, jSONObject2}, null, f56994a, true, 60737, new Class[]{b.class, JSONObject.class}, Void.TYPE);
        } else if (bVar2 != null && jSONObject2 != null) {
            a(jSONObject);
            try {
                jSONObject2.put("requestStart", bVar2.f19734e);
                jSONObject2.put("responseBack", bVar2.f19735f);
                jSONObject2.put("completeReadResponse", bVar2.g);
                jSONObject2.put("appLevelRequestStart", bVar2.f19732c);
                jSONObject2.put("beforeAllInterceptors", bVar2.f19733d);
                jSONObject2.put("requestEnd", bVar2.h);
                jSONObject2.put("recycleCount", bVar2.i);
                if (com.bytedance.ttnet.b.a()) {
                    jSONObject2.put("netClientType", "CronetClient");
                } else {
                    jSONObject2.put("netClientType", "TTOkhttp3Client");
                }
                if (bVar2.u == 0) {
                    jSONObject2.put("timing_dns", bVar2.j);
                    jSONObject2.put("timing_connect", bVar2.k);
                    jSONObject2.put("timing_ssl", bVar2.l);
                    jSONObject2.put("timing_send", bVar2.m);
                    jSONObject2.put("timing_waiting", bVar2.q);
                    jSONObject2.put("timing_receive", bVar2.o);
                    jSONObject2.put("timing_total", bVar2.r);
                    jSONObject2.put("timing_isSocketReused", bVar2.p);
                    jSONObject2.put("timing_totalSendBytes", bVar2.s);
                    jSONObject2.put("timing_totalReceivedBytes", bVar2.t);
                    jSONObject2.put("timing_remoteIP", bVar2.f19730a);
                    jSONObject2.put("request_log", bVar2.v);
                }
                if (bVar2.w != null) {
                    jSONObject2.put("req_info", bVar2.w);
                }
                jSONObject2.put("download", bVar2.x);
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(long j, long j2, String str, b bVar, Throwable th, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, bVar, th, null}, this, f56994a, false, 60734, new Class[]{Long.TYPE, Long.TYPE, String.class, b.class, Throwable.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, bVar, th, null}, this, f56994a, false, 60734, new Class[]{Long.TYPE, Long.TYPE, String.class, b.class, Throwable.class, JSONObject.class}, Void.TYPE);
            return;
        }
        final long j5 = j;
        final long j6 = j2;
        final String str2 = str;
        final b bVar2 = bVar;
        final Throwable th2 = th;
        AnonymousClass1 r0 = new Callable<Object>(null) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56995a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f56995a, false, 60739, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f56995a, false, 60739, new Class[0], Object.class);
                }
                n.b("aweme_image_api", "", l.this.a(false, j5, j6, str2, bVar2, th2));
                try {
                    String[] strArr = new String[1];
                    int a2 = i.a(th2, strArr);
                    if (StringUtils.isEmpty(strArr[0]) && bVar2 != null) {
                        strArr[0] = bVar2.f19730a;
                    }
                    JSONObject jSONObject = null;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = jSONObject;
                    l.a(bVar2, jSONObject2);
                    com.bytedance.article.common.monitor.a.a().a(str2, a2, strArr[0], j5, jSONObject2);
                } catch (Throwable unused) {
                }
                return null;
            }
        };
        a.i.a((Callable<TResult>) r0);
    }

    public final void b(long j, long j2, String str, b bVar, Throwable th, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j3 = j;
        long j4 = j2;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, bVar2, null, jSONObject}, this, f56994a, false, 60735, new Class[]{Long.TYPE, Long.TYPE, String.class, b.class, Throwable.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, bVar2, null, jSONObject}, this, f56994a, false, 60735, new Class[]{Long.TYPE, Long.TYPE, String.class, b.class, Throwable.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.b("aweme_image_api", "", a(true, j, j2, str, bVar, (Throwable) null));
        try {
            String[] strArr = new String[1];
            if (StringUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f19730a;
            }
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject;
            }
            a(bVar2, jSONObject2);
            com.bytedance.article.common.monitor.a.a().a(str, 200, strArr[0], j, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject a(boolean z, long j, long j2, String str, b bVar, Throwable th) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        b bVar2 = bVar;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j3), new Long(j4), str2, bVar2, th2}, this, f56994a, false, 60738, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE, String.class, b.class, Throwable.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j3), new Long(j4), str2, bVar2, th2}, this, f56994a, false, 60738, new Class[]{Boolean.TYPE, Long.TYPE, Long.TYPE, String.class, b.class, Throwable.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str2.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception unused) {
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
            strArr[0] = bVar2.f19730a;
            if (bVar2.f19731b != null) {
                if (((d) bVar2.f19731b).n > 0) {
                    jSONObject.put("index", ((d) bVar2.f19731b).n);
                }
                if (((d) bVar2.f19731b).m > 0) {
                    jSONObject.put("httpIndex", ((d) bVar2.f19731b).m);
                }
            }
        }
        if (bVar2 != null) {
            jSONObject.put("requestStart", bVar2.f19734e);
            jSONObject.put("responseBack", bVar2.f19735f);
            jSONObject.put("completeReadResponse", bVar2.g);
            jSONObject.put("requestEnd", bVar2.h);
            jSONObject.put("recycleCount", bVar2.i);
            if (bVar2.u == 0) {
                jSONObject.put("timing_dns", bVar2.j);
                jSONObject.put("timing_connect", bVar2.k);
                jSONObject.put("timing_ssl", bVar2.l);
                jSONObject.put("timing_send", bVar2.m);
                jSONObject.put("timing_waiting", bVar2.q);
                jSONObject.put("timing_receive", bVar2.o);
                jSONObject.put("timing_total", bVar2.r);
                jSONObject.put("timing_isSocketReused", bVar2.p);
                jSONObject.put("timing_totalSendBytes", bVar2.s);
                jSONObject.put("timing_totalReceivedBytes", bVar2.t);
                jSONObject.put("timing_remoteIP", bVar2.f19730a);
                jSONObject.put("request_log", bVar2.v);
            }
            jSONObject.put("download", bVar2.x);
        }
        if (com.bytedance.ttnet.b.a()) {
            jSONObject.put("netClientType", "CronetClient");
        } else {
            jSONObject.put("netClientType", "TTOkhttp3Client");
        }
        jSONObject.put("networkQuality", c.b().c().toString());
        jSONObject.put("downloadSpeed", (int) c.b().d());
        if (!z && th2 != null) {
            jSONObject.put("errorDesc", Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j3);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", Uri.parse(str));
        }
        if (j4 > 0) {
            jSONObject.put("timestamp", j4);
        }
        int i = 200;
        if (!z) {
            i = i.a(th2, strArr);
        }
        jSONObject.put("status", i);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("ip", strArr[0]);
        }
        jSONObject.put("network_type", com.bytedance.framwork.core.monitor.b.b(GlobalContext.getContext().getApplicationContext()).getValue());
        return jSONObject;
    }
}
