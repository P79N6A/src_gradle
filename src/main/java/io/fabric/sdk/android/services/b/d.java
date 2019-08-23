package io.fabric.sdk.android.services.b;

import android.content.Context;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f83166a;

    private String b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(d(), new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public final b a() {
        if (a(this.f83166a)) {
            return new b(b(), c());
        }
        return null;
    }

    private boolean c() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(d(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private Object d() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f83166a});
        } catch (Exception unused) {
            return null;
        }
    }

    public d(Context context) {
        this.f83166a = context.getApplicationContext();
    }

    private static boolean a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
