package com.ss.android.ugc.aweme.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.audio.i;

public final /* synthetic */ class h implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34429a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34430b;

    h(g gVar) {
        this.f34430b = gVar;
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34429a, false, 23915, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34429a, false, 23915, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        g gVar = this.f34430b;
        if (PatchProxy.isSupport(new Object[0], gVar, g.f34417a, false, 23914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], gVar, g.f34417a, false, 23914, new Class[0], Void.TYPE);
        } else {
            if (gVar.g.hasMessages(1)) {
                gVar.g.removeMessages(1);
            }
            gVar.f34420d = false;
            gVar.b();
        }
        return true;
    }
}
