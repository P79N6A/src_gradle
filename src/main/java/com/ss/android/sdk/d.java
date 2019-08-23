package com.ss.android.sdk;

import android.app.Dialog;
import android.os.Looper;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class d {
    @TargetClass
    @Proxy
    static void a(Dialog dialog) {
        if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }
}
