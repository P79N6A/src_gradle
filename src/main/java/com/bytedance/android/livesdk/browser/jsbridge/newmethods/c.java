package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9575a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9576b;

    c(a aVar) {
        this.f9576b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9575a, false, 3662, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9575a, false, 3662, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f9576b;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        aVar.a(new a.b(false, (byte) 0));
    }
}
