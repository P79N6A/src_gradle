package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.model.m;

public final /* synthetic */ class v implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38861a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38862b;

    /* renamed from: c  reason: collision with root package name */
    private final m f38863c;

    v(CommerceVideoDelegate commerceVideoDelegate, m mVar) {
        this.f38862b = commerceVideoDelegate;
        this.f38863c = mVar;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f38861a, false, 30701, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f38861a, false, 30701, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38862b;
        m mVar = this.f38863c;
        if (a.a()) {
            d.b a2 = d.a(str, str2, j).h("track_url").a("track_ad");
            a2.f("cpv_" + mVar.f39395b + NotifyType.SOUND).b(commerceVideoDelegate.f38688e).c();
        }
    }
}
