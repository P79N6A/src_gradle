package com.bytedance.android.live.core.utils.a.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.utils.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.List;

public class d implements c, com.bytedance.android.live.core.utils.a.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8220a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f8221b = Arrays.asList(new String[]{"RLI-AN00"});

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f8220a, false, 1411, new Class[0], Boolean.TYPE)) {
            return f8221b.contains(Build.MODEL);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8220a, false, 1411, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int a(Configuration configuration) {
        Configuration configuration2 = configuration;
        if (PatchProxy.isSupport(new Object[]{configuration2}, this, f8220a, false, 1410, new Class[]{Configuration.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{configuration2}, this, f8220a, false, 1410, new Class[]{Configuration.class}, Integer.TYPE)).intValue();
        } else if (!a()) {
            return -1;
        } else {
            float f2 = (((float) configuration2.screenHeightDp) * 1.0f) / ((float) configuration2.screenWidthDp);
            if (f2 < 0.75f || f2 > 1.3333334f) {
                return 1;
            }
            return 0;
        }
    }

    public final boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f8220a, false, 1409, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f8220a, false, 1409, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }
}
