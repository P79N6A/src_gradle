package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ao;

public final /* synthetic */ class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38805a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate.AnonymousClass4 f38806b;

    al(CommerceVideoDelegate.AnonymousClass4 r1) {
        this.f38806b = r1;
    }

    public final void run() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f38805a, false, 30731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38805a, false, 30731, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate.AnonymousClass4 r9 = this.f38806b;
        if (r9.f38699b > 0) {
            if (PatchProxy.isSupport(new Object[0], r9, CommerceVideoDelegate.AnonymousClass4.f38698a, false, 30728, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], r9, CommerceVideoDelegate.AnonymousClass4.f38698a, false, 30728, new Class[0], Void.TYPE);
                return;
            }
            a.C0509a a2 = r9.e().a("display_1s");
            if (PatchProxy.isSupport(new Object[0], r9, CommerceVideoDelegate.AnonymousClass4.f38698a, false, 30730, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], r9, CommerceVideoDelegate.AnonymousClass4.f38698a, false, 30730, new Class[0], Integer.TYPE)).intValue();
            } else {
                if (!CommerceVideoDelegate.this.q() && !CommerceVideoDelegate.this.l() && ao.b(CommerceVideoDelegate.this.mLinkTag)) {
                    i = 100;
                }
            }
            g.a(CommerceVideoDelegate.this.k, a2.a(i).a());
        }
    }
}
