package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.f;
import java.lang.reflect.Field;

public final class ee {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75819a;

    public static void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f75819a, true, 88604, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f75819a, true, 88604, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Field a2 = f.a(activity2, "mStartedActivity");
        if (a2 != null) {
            try {
                a2.setAccessible(true);
                a2.set(activity2, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }
}
