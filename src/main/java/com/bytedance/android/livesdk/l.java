package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15768a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f15769b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f15770c;

    l(LiveBroadcastFragment liveBroadcastFragment, HashMap hashMap) {
        this.f15769b = liveBroadcastFragment;
        this.f15770c = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15768a, false, 2598, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15768a, false, 2598, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f15769b.b(this.f15770c, dialogInterface);
    }
}
