package com.ss.android.common.applog;

import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.d.a.a;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;
import java.lang.reflect.Field;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28137a;

    @Insert
    @TargetClass
    static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f28137a, true, 15468, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f28137a, true, 15468, new Class[0], String.class);
        }
        try {
            Field declaredField = com.ss.android.d.d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    return c.a(a2, a.a(), 0).getString("install_id", "");
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return AppLog.getInstallId$___twin___();
    }

    @TargetClass
    @Proxy
    static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f28137a, true, 15471, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f28137a, true, 15471, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
        if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
            int i2 = i;
            Process.killProcess(i);
            return;
        }
        throw new RuntimeException("Process killed, pid is " + i);
    }

    @Insert
    @TargetClass
    static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f28137a, true, 15469, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f28137a, true, 15469, new Class[0], String.class);
        }
        try {
            Field declaredField = com.ss.android.d.d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    return c.a(a2, a.a(), 0).getString("device_id", "");
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return AppLog.getServerDeviceId$___twin___();
    }
}
