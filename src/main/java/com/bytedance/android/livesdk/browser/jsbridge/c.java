package com.bytedance.android.livesdk.browser.jsbridge;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9442a;

    /* renamed from: b  reason: collision with root package name */
    private final GeolocationPermissions.Callback f9443b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9444c;

    c(GeolocationPermissions.Callback callback, String str) {
        this.f9443b = callback;
        this.f9444c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9442a, false, 3603, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9442a, false, 3603, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        GeolocationPermissions.Callback callback = this.f9443b;
        String str = this.f9444c;
        if (i == -2) {
            callback.invoke(str, false, false);
            dialogInterface.dismiss();
            return;
        }
        if (i == -1) {
            callback.invoke(str, true, true);
            dialogInterface.dismiss();
        }
    }
}
