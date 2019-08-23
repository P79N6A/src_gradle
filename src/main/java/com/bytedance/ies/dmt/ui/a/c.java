package com.bytedance.ies.dmt.ui.a;

import android.os.Looper;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class c {
    @TargetClass
    @Proxy
    static void a(PopupWindow popupWindow) {
        if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
