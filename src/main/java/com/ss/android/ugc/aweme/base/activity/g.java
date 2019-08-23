package com.ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34524a;

    public static void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f34524a, true, 24126, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f34524a, true, 24126, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (PatchProxy.isSupport(new Object[]{activity2}, null, f34524a, true, 24128, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, f34524a, true, 24128, new Class[]{Activity.class}, Void.TYPE);
            } else {
                try {
                    Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(activity2, new Object[0]);
                    Class cls = null;
                    for (Class cls2 : Activity.class.getDeclaredClasses()) {
                        if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                            cls = cls2;
                        }
                    }
                    Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls, ActivityOptions.class});
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(activity2, new Object[]{null, invoke});
                } catch (Throwable unused) {
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{activity2}, null, f34524a, true, 24127, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, null, f34524a, true, 24127, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            try {
                Class cls3 = null;
                for (Class cls4 : Activity.class.getDeclaredClasses()) {
                    if (cls4.getSimpleName().contains("TranslucentConversionListener")) {
                        cls3 = cls4;
                    }
                }
                Method declaredMethod3 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls3});
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(activity2, new Object[]{null});
            } catch (Throwable unused2) {
            }
        }
    }
}
