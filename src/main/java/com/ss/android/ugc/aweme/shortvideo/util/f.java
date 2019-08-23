package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71132a;

    public static void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f71132a, true, 80851, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f71132a, true, 80851, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Field a2 = a(activity2, "mCalled");
        if (a2 != null) {
            try {
                a2.setAccessible(true);
                a2.set(activity2, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    public static Field a(Object obj, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{obj, str2}, null, f71132a, true, 80852, new Class[]{Object.class, String.class}, Field.class)) {
            return (Field) PatchProxy.accessDispatch(new Object[]{obj, str2}, null, f71132a, true, 80852, new Class[]{Object.class, String.class}, Field.class);
        } else if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            Class cls = obj.getClass();
            while (cls != Object.class) {
                try {
                    return cls.getDeclaredField(str2);
                } catch (Exception unused) {
                    cls = cls.getSuperclass();
                }
            }
            return null;
        }
    }
}
