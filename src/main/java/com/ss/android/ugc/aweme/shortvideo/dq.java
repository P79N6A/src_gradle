package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ar.text.r;

public final /* synthetic */ class dq implements r.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66788a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66789b;

    dq(PlanC planC) {
        this.f66789b = planC;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66788a, false, 74344, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66788a, false, 74344, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f66789b.g(z);
    }
}
