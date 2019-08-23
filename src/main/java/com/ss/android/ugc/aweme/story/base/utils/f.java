package com.ss.android.ugc.aweme.story.base.utils;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71950a;

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<View, Long> f71951b = new WeakHashMap<>();

    public static boolean a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, null, f71950a, true, 82305, new Class[]{View.class}, Boolean.TYPE)) {
            return a(view2, 1200);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, null, f71950a, true, 82305, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(View view, long j) {
        View view2 = view;
        long j2 = j;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view2, new Long(j2)}, null, f71950a, true, 82306, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, new Long(j2)}, null, f71950a, true, 82306, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            Long l = f71951b.get(view2);
            long nanoTime = System.nanoTime() / 1000000;
            if (l == null) {
                f71951b.put(view2, Long.valueOf(nanoTime));
                return false;
            }
            if (nanoTime - l.longValue() <= j2) {
                z = true;
            }
            f71951b.put(view2, Long.valueOf(nanoTime));
            return z;
        }
    }
}
