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

public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30284a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30284a, false, 18798, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30284a, false, 18798, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30284a, false, 18797, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30284a, false, 18797, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
            intent.putExtra("com.htc.launcher.extra.COUNT", i2);
            Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
            intent2.putExtra("packagename", componentName.getPackageName());
            intent2.putExtra("count", i2);
            if (com.ss.android.newmedia.redbadge.c.a.a(context2, intent) || com.ss.android.newmedia.redbadge.c.a.a(context2, intent2)) {
                try {
                    context2.sendBroadcast(intent);
                    context2.sendBroadcast(intent2);
                } catch (Throwable th) {
                    throw new e(th.getMessage());
                }
            } else {
                throw new e("unable to resolve intent: " + intent2.toString());
            }
        }
    }
}
