package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class n implements Callback {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<o, String> f26116f = new HashMap<o, String>() {
        {
            put(o.COM, "api.mapbox.com");
            put(o.STAGING, "api.mapbox.com");
            put(o.CHINA, "api.mapbox.cn");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final Context f26117a;

    /* renamed from: b  reason: collision with root package name */
    final String f26118b;

    /* renamed from: c  reason: collision with root package name */
    final String f26119c;

    /* renamed from: d  reason: collision with root package name */
    final OkHttpClient f26120d;

    /* renamed from: e  reason: collision with root package name */
    final List<m> f26121e = new CopyOnWriteArrayList();

    private void a() {
        SharedPreferences.Editor edit = bp.d(this.f26117a).edit();
        edit.putLong("mapboxConfigSyncTimestamp", System.currentTimeMillis());
        edit.apply();
    }

    static String a(Context context) {
        new p();
        q a2 = p.a();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return f26116f.get(a2.a(applicationInfo.metaData).f26056a);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "api.mapbox.com";
    }

    public final void onFailure(Call call, IOException iOException) {
        a();
    }

    public final void onResponse(Call call, Response response) throws IOException {
        a();
        if (response != null) {
            ResponseBody body = response.body();
            if (body != null) {
                for (m a2 : this.f26121e) {
                    a2.a(body.string());
                }
            }
        }
    }

    n(Context context, String str, String str2, OkHttpClient okHttpClient) {
        this.f26117a = context;
        this.f26118b = str;
        this.f26119c = str2;
        this.f26120d = okHttpClient;
    }
}
