package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.ArrayList;
import java.util.List;

public class o implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30302a;

    public final List<String> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f30302a, false, 18827, new Class[0], List.class)) {
            return new ArrayList(0);
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f30302a, false, 18827, new Class[0], List.class);
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        if (PatchProxy.isSupport(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30302a, false, 18826, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, componentName, Integer.valueOf(i)}, this, f30302a, false, 18826, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i2);
            bundle.putString("app_badge_component_name", componentName.flattenToString());
            try {
                context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", null, bundle);
            } catch (Throwable th) {
                throw new e(th.getMessage());
            }
        }
    }
}
