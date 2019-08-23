package com.ss.android.ugc.aweme.commerce.sdk.e;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37724a;

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<View, Long> f37725b = new WeakHashMap<>();

    public static boolean a(View view, long j) {
        View view2 = view;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view2, 500L}, null, f37724a, true, 29566, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, 500L}, null, f37724a, true, 29566, new Class[]{View.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            Long l = f37725b.get(view2);
            long nanoTime = System.nanoTime() / 1000000;
            if (l == null) {
                f37725b.put(view2, Long.valueOf(nanoTime));
                return false;
            }
            if (nanoTime - l.longValue() <= 500) {
                z = true;
            }
            f37725b.put(view2, Long.valueOf(nanoTime));
            return z;
        }
    }
}
