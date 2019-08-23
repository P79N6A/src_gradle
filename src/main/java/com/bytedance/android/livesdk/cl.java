package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.effect.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cl implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13572a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13573b;

    cl(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13573b = startLiveFragmentDefault;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13572a, false, 2961, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13572a, false, 2961, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f13573b.a(z);
    }
}
