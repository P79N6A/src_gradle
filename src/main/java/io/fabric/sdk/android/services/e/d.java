package io.fabric.sdk.android.services.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ss.android.ugc.aweme.q.c;
import io.fabric.sdk.android.i;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f83294a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83295b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f83296c;

    public final SharedPreferences a() {
        return this.f83294a;
    }

    public final SharedPreferences.Editor b() {
        return this.f83294a.edit();
    }

    @Deprecated
    public d(i iVar) {
        this(iVar.context, iVar.getClass().getName());
    }

    @TargetApi(9)
    public final boolean a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public d(Context context, String str) {
        if (context != null) {
            this.f83296c = context;
            this.f83295b = str;
            this.f83294a = c.a(this.f83296c, this.f83295b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }
}
