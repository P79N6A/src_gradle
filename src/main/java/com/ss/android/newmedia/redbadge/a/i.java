package com.ss.android.newmedia.redbadge.a;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Collections;
import java.util.List;

public class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30286a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f30287b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f30288c = Integer.MIN_VALUE;

    public final List<String> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f30286a, false, 18802, new Class[0], List.class)) {
            return Collections.singletonList("com.oppo.launcher");
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f30286a, false, 18802, new Class[0], List.class);
    }

    @TargetApi(11)
    public final void a(Context context, ComponentName componentName, int i) throws e {
        Context context2 = context;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30286a, false, 18801, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30286a, false, 18801, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName != null && this.f30288c != i2 && (this.f30288c <= 99 || i2 <= 99)) {
            this.f30288c = i2;
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("pakeageName", componentName.getPackageName());
            intent.putExtra("number", i2);
            intent.putExtra("upgradeNumber", i2);
            if (com.ss.android.newmedia.redbadge.c.a.a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new e(th.getMessage());
                }
            } else {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("app_badge_count", i2);
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, bundle);
                } catch (Throwable unused) {
                    throw new e("unable to resolve intent: " + intent.toString());
                }
            }
        }
    }
}
