package com.bytedance.android.livesdk.livecommerce.f;

import android.content.Context;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16197a;

    /* renamed from: b  reason: collision with root package name */
    public static a f16198b = a.UNKNOWN;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public static volatile Point[] f16199c = new Point[2];

    public enum a {
        FULL_SCREEN,
        NORMAL_SCREEN,
        UNKNOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static int a(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f16197a, true, 10732, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f16197a, true, 10732, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        } else {
            return 0;
        }
    }
}
