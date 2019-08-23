package com.ss.android.ugc.aweme.feed;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.a.b;

public final /* synthetic */ class l implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45599a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45600b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45601c;

    /* renamed from: d  reason: collision with root package name */
    private final a f45602d;

    l(d dVar, Aweme aweme, a aVar) {
        this.f45600b = dVar;
        this.f45601c = aweme;
        this.f45602d = aVar;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45599a, false, 40028, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45599a, false, 40028, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f45600b.a(this.f45601c, this.f45602d, str);
    }
}
