package com.ss.android.ugc.aweme.photomovie.edit.cover;

import android.support.annotation.FloatRange;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public interface a {

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.a$a  reason: collision with other inner class name */
    public static class C0659a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58910a;

        public final int a(int i, float f2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f58910a, false, 64065, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f58910a, false, 64065, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
            }
            int ceil = (int) (Math.ceil((double) (((float) i) * f2)) - 1.0d);
            if (ceil < 0) {
                return 0;
            }
            return ceil;
        }
    }

    int a(int i, @FloatRange(from = 0.0d, to = 1.0d) float f2);
}
