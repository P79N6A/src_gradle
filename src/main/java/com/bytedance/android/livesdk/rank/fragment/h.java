package com.bytedance.android.livesdk.rank.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16984a;

    /* renamed from: b  reason: collision with root package name */
    private final TopRankFragment f16985b;

    h(TopRankFragment topRankFragment) {
        this.f16985b = topRankFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16984a, false, 13043, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f16984a, false, 13043, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f16985b.f16958c.f17019b = (List) obj;
    }
}
