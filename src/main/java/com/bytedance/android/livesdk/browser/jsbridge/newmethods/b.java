package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9573a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9574b;

    b(a aVar) {
        this.f9574b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9573a, false, 3661, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9573a, false, 3661, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f9574b;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        aVar.a(new a.b(true, (byte) 0));
    }
}
