package com.ss.android.newmedia.redbadge.a;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Collections;
import java.util.List;

public class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30303a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f30304b = Uri.parse("content://com.android.badge/badge");

    public final List<String> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f30303a, false, 18829, new Class[0], List.class)) {
            return Collections.singletonList("com.zui.launcher");
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f30303a, false, 18829, new Class[0], List.class);
    }

    @TargetApi(11)
    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30303a, false, 18828, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30303a, false, 18828, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context == null || componentName == null) {
        } else {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i2);
                try {
                    context.getContentResolver().call(this.f30304b, "setAppBadgeCount", null, bundle);
                } catch (Throwable th) {
                    th = th;
                    throw new e(th.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                throw new e(th.getMessage());
            }
        }
    }
}
