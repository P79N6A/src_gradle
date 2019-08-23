package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;

public final class bn {

    /* renamed from: a  reason: collision with root package name */
    static final Map<a, Boolean> f26093a = new HashMap<a, Boolean>() {
        {
            put(a.ENABLED, Boolean.TRUE);
            put(a.DISABLED, Boolean.FALSE);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, a> f26094b = new HashMap<String, a>() {
        {
            put(a.ENABLED.name(), a.ENABLED);
            put(a.DISABLED.name(), a.DISABLED);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private boolean f26095c;

    /* renamed from: d  reason: collision with root package name */
    private a f26096d;

    public enum a {
        ENABLED,
        DISABLED
    }

    public final a b() {
        if (this.f26095c) {
            return a();
        }
        return this.f26096d;
    }

    public static a a() {
        if (MapboxTelemetry.g == null) {
            return f26094b.get(a.ENABLED.name());
        }
        return f26094b.get(bp.d(MapboxTelemetry.g).getString("mapboxTelemetryState", a.ENABLED.name()));
    }

    bn(boolean z) {
        this.f26095c = true;
        this.f26096d = a.ENABLED;
        this.f26095c = true;
    }

    public static a a(a aVar) {
        if (MapboxTelemetry.g == null) {
            return aVar;
        }
        SharedPreferences.Editor edit = bp.d(MapboxTelemetry.g).edit();
        edit.putString("mapboxTelemetryState", aVar.name());
        edit.apply();
        return aVar;
    }

    public static boolean a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getBoolean("com.mapbox.EnableEvents", true);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
