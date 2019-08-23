package com.ss.android.ugc.aweme.story.d;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72347a;

    public static void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f72347a, true, 86513, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f72347a, true, 86513, new Class[]{Activity.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
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
            } catch (Throwable th) {
                a.a(th);
            }
        }
    }
}
