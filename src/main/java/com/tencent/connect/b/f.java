package com.tencent.connect.b;

import android.app.Dialog;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class f {
    @TargetClass
    @Proxy
    static void a(Dialog dialog) {
        if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            f.super.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    @TargetClass
    @Proxy
    static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            eq.a(toast);
        }
        toast.show();
    }
}
