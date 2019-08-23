package com.bytedance.android.livesdk.bgbroadcast;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9185a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastFragment f9186b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f9187c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9188d;

    f(BgBroadcastFragment bgBroadcastFragment, HashMap hashMap, boolean z) {
        this.f9186b = bgBroadcastFragment;
        this.f9187c = hashMap;
        this.f9188d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9185a, false, 3255, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9185a, false, 3255, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f9186b.a(this.f9187c, this.f9188d, dialogInterface);
    }
}
