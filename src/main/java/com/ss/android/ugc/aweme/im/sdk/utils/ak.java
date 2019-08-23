package com.ss.android.ugc.aweme.im.sdk.utils;

import android.os.Build;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.bytex.a.a.a;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52479a;

    public static void a(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52479a, true, 53681, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52479a, true, 53681, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 21) {
            au.a(view);
            view2.setBackground(a.a(view.getResources(), i2));
        } else {
            view2.setBackground(a.a(view.getResources(), i));
        }
    }
}
