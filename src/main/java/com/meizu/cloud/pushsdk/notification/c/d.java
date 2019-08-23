package com.meizu.cloud.pushsdk.notification.c;

import android.content.Context;
import android.content.res.AssetManager;
import com.meizu.cloud.pushinternal.DebugLogger;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f27243b;

    /* renamed from: a  reason: collision with root package name */
    private Context f27244a;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f27245c;

    private d(Context context) {
        this.f27244a = context;
        a();
    }

    public static d a(Context context) {
        if (f27243b == null) {
            f27243b = new d(context);
        }
        return f27243b;
    }

    private void a() {
        this.f27245c = this.f27244a.getAssets();
    }

    public int a(String str, String str2) {
        DebugLogger.i("ResourceReader", "Get resource type " + str2 + " " + str);
        return this.f27244a.getResources().getIdentifier(str, str2, this.f27244a.getApplicationInfo().packageName);
    }
}
