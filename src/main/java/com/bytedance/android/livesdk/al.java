package com.bytedance.android.livesdk;

import android.os.Looper;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9017a;

    @TargetClass
    @Proxy
    static void a(PopupWindow popupWindow) {
        if (PatchProxy.isSupport(new Object[]{popupWindow}, null, f9017a, true, 2753, new Class[]{PopupWindow.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{popupWindow}, null, f9017a, true, 2753, new Class[]{PopupWindow.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            popupWindow.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }
}
