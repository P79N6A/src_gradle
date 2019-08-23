package com.ss.android.ugc.aweme.c.a;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35251a;

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<View, Long> f35252b = new WeakHashMap<>();

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f35251a, true, 23867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f35251a, true, 23867, new Class[0], Void.TYPE);
        } else {
            f35252b.clear();
        }
    }

    public static boolean a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, null, f35251a, true, 23868, new Class[]{View.class}, Boolean.TYPE)) {
            return a(view2, 1200);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, null, f35251a, true, 23868, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(View view, long j) {
        View view2 = view;
        long j2 = j;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view2, new Long(j2)}, null, f35251a, true, 23869, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, new Long(j2)}, null, f35251a, true, 23869, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            Long l = f35252b.get(view2);
            long nanoTime = System.nanoTime() / 1000000;
            if (l == null) {
                f35252b.put(view2, Long.valueOf(nanoTime));
                return false;
            }
            if (nanoTime - l.longValue() <= j2) {
                z = true;
            }
            if (!z) {
                f35252b.put(view2, Long.valueOf(nanoTime));
            }
            return z;
        }
    }
}
