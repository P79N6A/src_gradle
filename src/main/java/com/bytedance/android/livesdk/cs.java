package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.effect.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cs implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13655a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13656b;

    cs(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13656b = startLiveFragmentDefault;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13655a, false, 2968, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13655a, false, 2968, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f13656b.a(z);
    }
}
