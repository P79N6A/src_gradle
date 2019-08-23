package com.ss.android.ugc.aweme.music;

import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.thread.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56318a;

    /* renamed from: c  reason: collision with root package name */
    private static c f56319c;

    /* renamed from: b  reason: collision with root package name */
    public a f56320b;

    /* renamed from: d  reason: collision with root package name */
    private OkHttpClient f56321d;

    public interface a {
        void a(String str);
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f56318a, true, 59797, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f56318a, true, 59797, new Class[0], c.class);
        }
        if (f56319c == null) {
            synchronized (c.class) {
                if (f56319c == null) {
                    f56319c = new c();
                }
            }
        }
        return f56319c;
    }

    private OkHttpClient b() {
        if (PatchProxy.isSupport(new Object[0], this, f56318a, false, 59799, new Class[0], OkHttpClient.class)) {
            return (OkHttpClient) PatchProxy.accessDispatch(new Object[0], this, f56318a, false, 59799, new Class[0], OkHttpClient.class);
        }
        if (this.f56321d == null) {
            this.f56321d = new OkHttpClient().newBuilder().dispatcher(new Dispatcher(h.c())).connectTimeout(60, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).retryOnConnectionFailure(true).followSslRedirects(false).followRedirects(false).build();
        }
        return this.f56321d;
    }

    public final void a(final MusicModel musicModel, HashMap<String, String> hashMap) {
        if (PatchProxy.isSupport(new Object[]{musicModel, hashMap}, this, f56318a, false, 59798, new Class[]{MusicModel.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, hashMap}, this, f56318a, false, 59798, new Class[]{MusicModel.class, HashMap.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(musicModel.getPath()) && this.f56320b != null) {
            if (!musicModel.isRedirect()) {
                this.f56320b.a(musicModel.getPath());
                return;
            }
            Request.Builder url = new Request.Builder().url(musicModel.getPath());
            if (hashMap != null) {
                for (Map.Entry next : hashMap.entrySet()) {
                    url.addHeader((String) next.getKey(), (String) next.getValue());
                }
            }
            b().newCall(url.build()).enqueue(new Callback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56322a;

                public final void onFailure(Call call, IOException iOException) {
                    if (PatchProxy.isSupport(new Object[]{call, iOException}, this, f56322a, false, 59802, new Class[]{Call.class, IOException.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, iOException}, this, f56322a, false, 59802, new Class[]{Call.class, IOException.class}, Void.TYPE);
                    } else if (c.this.f56320b != null) {
                        c.this.f56320b.a(musicModel.getPath());
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(PushConstants.WEB_URL, musicModel.getPath());
                        } catch (JSONException unused) {
                        }
                        MonitorUtils.monitorCommonLog("log_copyright_redirect_error", jSONObject);
                        n.a("log_copyright_redirect_status", 1, jSONObject);
                    }
                }

                public final void onResponse(Call call, Response response) throws IOException {
                    boolean z;
                    String str;
                    if (PatchProxy.isSupport(new Object[]{call, response}, this, f56322a, false, 59801, new Class[]{Call.class, Response.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, response}, this, f56322a, false, 59801, new Class[]{Call.class, Response.class}, Void.TYPE);
                    } else if (c.this.f56320b != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(PushConstants.WEB_URL, musicModel.getPath());
                        } catch (JSONException unused) {
                        }
                        switch (response.code()) {
                            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f /*?: ONE_ARG  (wrap: ?
  ?: SGET   com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f int)*/:
                            case 301:
                            case 302:
                            case 303:
                            case 307:
                            case 308:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            c cVar = c.this;
                            Headers headers = response.headers();
                            if (PatchProxy.isSupport(new Object[]{headers, "Location"}, cVar, c.f56318a, false, 59800, new Class[]{Headers.class, String.class}, String.class)) {
                                c cVar2 = cVar;
                                str = (String) PatchProxy.accessDispatch(new Object[]{headers, "Location"}, cVar2, c.f56318a, false, 59800, new Class[]{Headers.class, String.class}, String.class);
                            } else if (headers == null || TextUtils.isEmpty("Location")) {
                                str = null;
                            } else {
                                str = headers.get("Location");
                            }
                            if (StringUtils.isEmpty(str)) {
                                c.this.f56320b.a(musicModel.getPath());
                                MonitorUtils.monitorCommonLog("log_copyright_redirect_error", jSONObject);
                                n.a("log_copyright_redirect_status", 1, jSONObject);
                            } else {
                                c.this.f56320b.a(str);
                                n.a("log_copyright_redirect_status", 0, jSONObject);
                            }
                        } else {
                            c.this.f56320b.a(musicModel.getPath());
                            MonitorUtils.monitorCommonLog("log_copyright_redirect_error", jSONObject);
                            n.a("log_copyright_redirect_status", 1, jSONObject);
                        }
                    }
                }
            });
        }
    }
}
