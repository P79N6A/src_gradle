package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12265a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f12266b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f12267c;

    i(Runnable runnable, Map map) {
        this.f12266b = runnable;
        this.f12267c = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12265a, false, 5563, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12265a, false, 5563, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AbsInteractionFragment.a(this.f12266b, this.f12267c, dialogInterface);
    }
}
