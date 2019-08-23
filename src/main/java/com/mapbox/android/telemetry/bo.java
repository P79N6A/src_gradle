package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public final class bo {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, a> f26097b = new HashMap<String, a>() {
        {
            put(a.ENABLED.name(), a.ENABLED);
            put(a.DISABLED.name(), a.DISABLED);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public a f26098a = a.DISABLED;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26099c = true;

    public enum a {
        ENABLED,
        DISABLED
    }

    bo(boolean z) {
    }

    public final a a(Context context) {
        if (this.f26099c) {
            return b(context);
        }
        return this.f26098a;
    }

    private static a b(Context context) {
        String string = bp.d(context).getString("mapboxTelemetryLocationState", a.DISABLED.name());
        if (string != null) {
            return f26097b.get(string);
        }
        return f26097b.get(a.DISABLED.name());
    }

    private static a b(a aVar, Context context) {
        SharedPreferences.Editor edit = bp.d(context).edit();
        edit.putString("mapboxTelemetryLocationState", aVar.name());
        edit.apply();
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final a a(a aVar, Context context) {
        if (this.f26099c) {
            return b(aVar, context);
        }
        this.f26098a = aVar;
        return this.f26098a;
    }
}
