package com.bytedance.android.livesdk.bgbroadcast;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9189a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f9190b;

    g(HashMap hashMap) {
        this.f9190b = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f9189a, false, 3256, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f9189a, false, 3256, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        BgBroadcastFragment.a(this.f9190b, dialogInterface2);
    }
}
