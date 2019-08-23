package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.model.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38854a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38855b;

    /* renamed from: c  reason: collision with root package name */
    private final m f38856c;

    public s(CommerceVideoDelegate commerceVideoDelegate, m mVar) {
        this.f38855b = commerceVideoDelegate;
        this.f38856c = mVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38854a, false, 30698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38854a, false, 30698, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38855b;
        m mVar = this.f38856c;
        v vVar = new v(commerceVideoDelegate, mVar);
        Aweme aweme = commerceVideoDelegate.f38688e;
        int i = mVar.f39395b;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i), vVar}, null, g.f39316a, true, 31767, new Class[]{Aweme.class, Integer.TYPE, g.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i), vVar}, null, g.f39316a, true, 31767, new Class[]{Aweme.class, Integer.TYPE, g.a.class}, Void.TYPE);
        } else if (aweme != null && aweme.isAd()) {
            for (m next : aweme.getAwemeRawAd().getPlaybackSecondsTrackList()) {
                if (next.f39395b == i) {
                    g.a((g.a) vVar, (Collection<String>) next.f39396c, false);
                    return;
                }
            }
        }
    }
}
