package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;

public final class b extends com.ss.android.ugc.aweme.common.b<a, s> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45473a;

    /* renamed from: b  reason: collision with root package name */
    private Aweme f45474b;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45473a, false, 42014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45473a, false, 42014, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2979f != null) {
            ((s) this.f2979f).a((AwemeAdStatus) ((a) i()).getData(), ((a) i()).f45456c);
        }
    }

    public b(Aweme aweme) {
        this.f45474b = aweme;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f45473a, false, 42013, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f45473a, false, 42013, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null) {
            ((s) this.f2979f).a(exc, (AwemeAdStatus) ((a) i()).getData(), ((a) i()).f45456c, this.f45474b);
        }
    }
}
