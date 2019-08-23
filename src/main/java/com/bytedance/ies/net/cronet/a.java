package com.bytedance.ies.net.cronet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.b.b;
import com.bytedance.ttnet.b.d;
import com.toutiao.proxyserver.net.f;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a implements e.k<b> {

    /* renamed from: a  reason: collision with root package name */
    protected Context f20868a;

    /* access modifiers changed from: protected */
    public abstract void a(long j, long j2, String str, String str2, String str3, b bVar, Throwable th, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void a(long j, long j2, String str, String str2, String str3, b bVar, JSONObject jSONObject);

    public a(Context context) {
        b.b();
        this.f20868a = context;
    }

    private static void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("nt_band_width", c.b().c());
                jSONObject.put("cdn_nt_band_width", com.bytedance.frameworks.baselib.network.a.a.a().c());
                jSONObject.put("cronet_open", com.bytedance.ttnet.config.a.a(TTNetInit.getTTNetDepend().a()).g());
                TTNetInit.getTTNetDepend();
                jSONObject.put("cronet_plugin_install", true);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            a(jSONObject);
            try {
                jSONObject.put("requestStart", bVar.f19734e);
                jSONObject.put("responseBack", bVar.f19735f);
                jSONObject.put("completeReadResponse", bVar.g);
                jSONObject.put("appLevelRequestStart", bVar.f19732c);
                jSONObject.put("beforeAllInterceptors", bVar.f19733d);
                jSONObject.put("requestEnd", bVar.h);
                jSONObject.put("recycleCount", bVar.i);
                if (bVar.u == 0) {
                    jSONObject.put("timing_dns", bVar.j);
                    jSONObject.put("timing_connect", bVar.k);
                    jSONObject.put("timing_ssl", bVar.l);
                    jSONObject.put("timing_send", bVar.m);
                    jSONObject.put("timing_waiting", bVar.q);
                    jSONObject.put("timing_receive", bVar.o);
                    jSONObject.put("timing_total", bVar.r);
                    jSONObject.put("timing_isSocketReused", bVar.p);
                    jSONObject.put("timing_totalSendBytes", bVar.s);
                    jSONObject.put("timing_totalReceivedBytes", bVar.t);
                    jSONObject.put("timing_remoteIP", bVar.f19730a);
                    jSONObject.put("request_log", bVar.v);
                }
                if (bVar.w != null) {
                    jSONObject.put("req_info", bVar.w);
                }
                jSONObject.put("download", bVar.x);
                if (bVar instanceof f) {
                    jSONObject.put("player_id", ((f) bVar).A);
                    jSONObject.put("video_cache_use_ttnet", ((f) bVar).B);
                    jSONObject.put("video_cache_retry_count", ((f) bVar).C);
                }
            } catch (JSONException unused) {
            }
        }
    }

    private static void a(Throwable th, JSONObject jSONObject) {
        if (th != null && jSONObject != null) {
            try {
                String message = th.getMessage();
                if (!StringUtils.isEmpty(message)) {
                    int length = message.length();
                    int indexOf = message.indexOf("ErrorCode=");
                    if (indexOf != -1) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = indexOf + 10; i < length; i++) {
                            char charAt = message.charAt(i);
                            if (!Character.isSpaceChar(charAt)) {
                                if (charAt != '-' && !Character.isDigit(charAt)) {
                                    break;
                                }
                                sb.append(charAt);
                            }
                        }
                        if (sb.length() > 0) {
                            jSONObject.put("cronet_error_code", sb.toString());
                        }
                    }
                    int indexOf2 = message.indexOf("InternalErrorCode=");
                    if (indexOf2 != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i2 = indexOf2 + 18; i2 < length; i2++) {
                            char charAt2 = message.charAt(i2);
                            if (!Character.isSpaceChar(charAt2)) {
                                if (charAt2 != '-' && !Character.isDigit(charAt2)) {
                                    break;
                                }
                                sb2.append(charAt2);
                            }
                        }
                        if (sb2.length() > 0) {
                            jSONObject.put("cronet_internal_error_code", sb2.toString());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final /* synthetic */ void a(long j, long j2, String str, String str2, com.bytedance.frameworks.baselib.network.http.a aVar) {
        b bVar = (b) aVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            String str3 = str;
            if (str.contains("&config_retry=b")) {
                jSONObject.put("log_config_retry", 1);
            }
            if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
                strArr[0] = bVar.f19730a;
                if (bVar.f19731b != null) {
                    if (((d) bVar.f19731b).n > 0) {
                        jSONObject.put("index", ((d) bVar.f19731b).n);
                    }
                    if (((d) bVar.f19731b).m > 0) {
                        jSONObject.put("httpIndex", ((d) bVar.f19731b).m);
                    }
                }
            }
            a(bVar, jSONObject);
            a(j, j2, str, str2, strArr[0], bVar, jSONObject);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void a(long j, long j2, String str, String str2, com.bytedance.frameworks.baselib.network.http.a aVar, Throwable th) {
        b bVar = (b) aVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
                strArr[0] = bVar.f19730a;
                if (bVar.f19731b != null) {
                    if (((d) bVar.f19731b).n > 0) {
                        jSONObject.put("index", ((d) bVar.f19731b).n);
                    }
                    if (((d) bVar.f19731b).m > 0) {
                        jSONObject.put("httpIndex", ((d) bVar.f19731b).m);
                    }
                }
            }
            a(th, jSONObject);
            a(bVar, jSONObject);
            a(j, j2, str, str2, strArr[0], bVar, th, jSONObject);
        } catch (Throwable unused) {
        }
    }
}
