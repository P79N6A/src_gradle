package com.ss.android.ugc.aweme.plugin.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59225a;

    /* renamed from: b  reason: collision with root package name */
    public int f59226b;

    public final void a() throws c {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f59225a, false, 64553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59225a, false, 64553, new Class[0], Void.TYPE);
            return;
        }
        this.f59226b++;
        if (this.f59226b <= 4) {
            z = true;
        }
        if (z) {
            try {
                Thread.sleep((long) (this.f59226b * 2000));
            } catch (InterruptedException unused) {
            }
        } else {
            throw new c();
        }
    }
}
