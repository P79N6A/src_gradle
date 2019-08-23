package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.bytex.a.a.a;

/* renamed from: com.ss.android.ugc.aweme.utils.do  reason: invalid class name */
public final class Cdo {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75758a;

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f75758a, true, 88528, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f75758a, true, 88528, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view2, 2130837839, C0906R.color.a17);
    }

    public static void a(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f75758a, true, 88529, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f75758a, true, 88529, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 21) {
            c.a(view);
            view2.setBackgroundColor(view.getResources().getColor(i2));
        } else {
            view2.setBackground(a.a(view.getResources(), i));
        }
    }
}
