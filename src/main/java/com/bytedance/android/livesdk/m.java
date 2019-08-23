package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16318a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f16319b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f16320c;

    m(LiveBroadcastFragment liveBroadcastFragment, HashMap hashMap) {
        this.f16319b = liveBroadcastFragment;
        this.f16320c = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16318a, false, 2599, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16318a, false, 2599, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f16319b.a(this.f16320c, dialogInterface);
    }
}
