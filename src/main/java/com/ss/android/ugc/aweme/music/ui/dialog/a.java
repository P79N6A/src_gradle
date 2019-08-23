package com.ss.android.ugc.aweme.music.ui.dialog;

import android.os.Looper;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56682a;

    @TargetClass
    @Proxy
    static void a(PopupWindow popupWindow) {
        if (PatchProxy.isSupport(new Object[]{popupWindow}, null, f56682a, true, 60543, new Class[]{PopupWindow.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{popupWindow}, null, f56682a, true, 60543, new Class[]{PopupWindow.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a.super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }
}
