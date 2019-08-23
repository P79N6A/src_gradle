package com.ss.android.newmedia.redbadge.a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class m implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30300a;

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30300a, false, 18823, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30300a, false, 18823, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.vivo.launcher", "com.bbk.launcher2"});
    }

    @SuppressLint({"WrongConstant"})
    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30300a, false, 18822, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30300a, false, 18822, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            try {
                Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra("className", componentName.getClassName());
                intent.putExtra("notificationNum", i2);
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.addFlags(16777216);
                }
                context2.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new e(th.getMessage());
            }
        }
    }
}
