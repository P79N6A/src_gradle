package com.bytedance.android.livesdk.browser.fragment;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9390a;

    /* renamed from: b  reason: collision with root package name */
    private final SslErrorHandler f9391b;

    k(SslErrorHandler sslErrorHandler) {
        this.f9391b = sslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9390a, false, 3564, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9390a, false, 3564, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f9391b.proceed();
    }
}
