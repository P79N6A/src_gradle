package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d;

import android.app.Dialog;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69426a;

    @TargetClass
    @Proxy
    static void a(Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, null, f69426a, true, 78982, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, f69426a, true, 78982, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b.super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }
}
