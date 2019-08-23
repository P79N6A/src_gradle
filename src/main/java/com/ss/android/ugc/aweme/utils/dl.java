package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.thread.h;

public final /* synthetic */ class dl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4291a;

    /* renamed from: b  reason: collision with root package name */
    public static final Runnable f4292b = new dl();

    private dl() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f4291a, false, 88523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4291a, false, 88523, new Class[0], Void.TYPE);
            return;
        }
        a.f2424a = h.d();
    }
}
