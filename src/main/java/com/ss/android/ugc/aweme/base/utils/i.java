package com.ss.android.ugc.aweme.base.utils;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35032a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardUtils.AndroidBug5497Workaround f35033b;

    i(KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround) {
        this.f35033b = androidBug5497Workaround;
    }

    public final void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f35032a, false, 25239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35032a, false, 25239, new Class[0], Void.TYPE);
            return;
        }
        KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround = this.f35033b;
        if (androidBug5497Workaround.f2792b != null && androidBug5497Workaround.f2793c != null) {
            Rect rect = new Rect();
            androidBug5497Workaround.f2792b.getWindowVisibleDisplayFrame(rect);
            double height = (double) androidBug5497Workaround.f2792b.getHeight();
            Double.isNaN(height);
            if (((double) rect.bottom) < height * 0.75d) {
                androidBug5497Workaround.f2793c.b();
            } else {
                androidBug5497Workaround.f2793c.a();
            }
        }
    }
}
