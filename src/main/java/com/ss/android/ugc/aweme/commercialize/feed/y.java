package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.an;
import com.ss.android.ugc.aweme.main.a;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class y implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38870a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38871b;

    y(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38871b = commerceVideoDelegate;
    }

    public final Object invoke() {
        if (PatchProxy.isSupport(new Object[0], this, f38870a, false, 30704, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f38870a, false, 30704, new Class[0], Object.class);
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38871b;
        commerceVideoDelegate.commerceGoodHalfCardContainer.setVisibility(8);
        a.a().a(false);
        bg.a(new an(false));
        commerceVideoDelegate.a(0);
        return null;
    }
}
