package io.fabric.sdk.android.services.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.services.e.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f83162a;

    /* renamed from: b  reason: collision with root package name */
    private final io.fabric.sdk.android.services.e.c f83163b;

    private f c() {
        return new d(this.f83162a);
    }

    private f d() {
        return new e(this.f83162a);
    }

    public final b b() {
        b a2 = c().a();
        if (b(a2)) {
            return a2;
        }
        b a3 = d().a();
        b(a3);
        return a3;
    }

    public final b a() {
        final b bVar = new b(this.f83163b.a().getString("advertising_id", ""), this.f83163b.a().getBoolean("limit_ad_tracking_enabled", false));
        if (b(bVar)) {
            new Thread(new h() {
                public final void onRun() {
                    b b2 = c.this.b();
                    if (!bVar.equals(b2)) {
                        c.this.a(b2);
                    }
                }
            }).start();
            return bVar;
        }
        b b2 = b();
        a(b2);
        return b2;
    }

    private static boolean b(b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f83160a)) {
            return false;
        }
        return true;
    }

    public c(Context context) {
        this.f83162a = context.getApplicationContext();
        this.f83163b = new d(context, "TwitterAdvertisingInfoPreferences");
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void a(b bVar) {
        if (b(bVar)) {
            this.f83163b.a(this.f83163b.b().putString("advertising_id", bVar.f83160a).putBoolean("limit_ad_tracking_enabled", bVar.f83161b));
        } else {
            this.f83163b.a(this.f83163b.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }
}
