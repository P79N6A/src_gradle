package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ao.a.c;
import com.ss.android.ugc.aweme.shortvideo.e;

public final /* synthetic */ class aq implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66981a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66982b;

    aq(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66982b = vEVideoPublishEditActivity;
    }

    public final void a(e eVar, boolean z) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f66981a, false, 76467, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Byte.valueOf(z)}, this, f66981a, false, 76467, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f66982b.a(eVar2, z);
    }
}
