package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30292a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30292a, false, 18813, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30292a, false, 18813, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.smartisanos.launcher", "com.smartisanos.home"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30292a, false, 18812, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30292a, false, 18812, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            Intent intent = new Intent("com.smartisanos.launcher.new_message");
            intent.putExtra("extra_packagename", componentName.getPackageName());
            intent.putExtra("extra_componentname", componentName.getClassName());
            intent.putExtra("extra_message_count", i2);
            if (com.ss.android.newmedia.redbadge.c.a.a(context2, intent)) {
                try {
                    context2.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new e(th.getMessage());
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("badge_num", i2);
                try {
                    context.getContentResolver().call(Uri.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", null, bundle);
                } catch (Throwable unused) {
                    throw new e("unable to resolve intent: " + intent.toString());
                }
            }
        }
    }
}
