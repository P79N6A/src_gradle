package com.ss.android.ugc.aweme.discover.c;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public final class b extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42182a;

    /* renamed from: b  reason: collision with root package name */
    public int f42183b = c.f69428f;

    public b(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f42182a, false, 37165, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f42182a, false, 37165, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.startScroll(i, i2, i3, i4, this.f42183b);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f42182a, false, 37164, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f42182a, false, 37164, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.startScroll(i, i2, i3, i4, this.f42183b);
    }
}
