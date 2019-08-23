package com.bytedance.android.livesdk.browser.fragment;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9392a;

    /* renamed from: b  reason: collision with root package name */
    private final SslErrorHandler f9393b;

    l(SslErrorHandler sslErrorHandler) {
        this.f9393b = sslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9392a, false, 3565, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9392a, false, 3565, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f9393b.cancel();
    }
}
