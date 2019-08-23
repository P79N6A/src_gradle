package com.ss.android.ugc.aweme.photo.setfilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58788a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectSetFilterLayout f58789b;

    /* renamed from: c  reason: collision with root package name */
    private final TabLayout.e f58790c;

    d(EffectSetFilterLayout effectSetFilterLayout, TabLayout.e eVar) {
        this.f58789b = effectSetFilterLayout;
        this.f58790c = eVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f58788a, false, 63843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58788a, false, 63843, new Class[0], Void.TYPE);
            return;
        }
        EffectSetFilterLayout effectSetFilterLayout = this.f58789b;
        effectSetFilterLayout.f58742e.b(this.f58790c);
    }
}
