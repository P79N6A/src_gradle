package com.ss.android.ugc.aweme.app.f;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34175a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f34176b;

    /* renamed from: c  reason: collision with root package name */
    private Handler.Callback f34177c;

    public final void onLooperPrepared() {
        if (PatchProxy.isSupport(new Object[0], this, f34175a, false, 23567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34175a, false, 23567, new Class[0], Void.TYPE);
            return;
        }
        this.f34176b = new Handler(getLooper(), this.f34177c);
    }
}
