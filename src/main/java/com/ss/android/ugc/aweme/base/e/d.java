package com.ss.android.ugc.aweme.base.e;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class d extends Resources {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34735a;

    private static boolean b(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f34735a, true, 25173, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, null, f34735a, true, 25173, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        }
        Field a2 = a(activity2, "mResumed");
        if (a2 != null) {
            try {
                a2.setAccessible(true);
                return ((Boolean) a2.get(activity2)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static boolean a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f34735a, true, 25175, new Class[]{Activity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, null, f34735a, true, 25175, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else if (!activity.isFinishing() || Build.VERSION.SDK_INT < 24 || b(activity)) {
            return false;
        } else {
            return true;
        }
    }

    private static Field a(Object obj, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{obj, str2}, null, f34735a, true, 25174, new Class[]{Object.class, String.class}, Field.class)) {
            return (Field) PatchProxy.accessDispatch(new Object[]{obj, str2}, null, f34735a, true, 25174, new Class[]{Object.class, String.class}, Field.class);
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

    public d(AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
        super(assetManager, displayMetrics, configuration);
    }
}
