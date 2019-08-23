package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30279a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30279a, false, 18787, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30279a, false, 18787, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30279a, false, 18786, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30279a, false, 18786, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
            intent.putExtra("package", componentName.getPackageName());
            intent.putExtra("count", i2);
            intent.putExtra("badgecount", i2);
            intent.putExtra("class", componentName.getClassName());
            context2.sendBroadcast(intent);
            if (com.ss.android.newmedia.redbadge.c.a.a(context2, intent)) {
                try {
                    context2.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new e(th.getMessage());
                }
            } else {
                throw new e("unable to resolve intent: " + intent.toString());
            }
        }
    }
}
