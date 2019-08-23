package com.bytedance.android.livesdk.rank.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.drakeet.multitype.d;

public final /* synthetic */ class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16990a;

    /* renamed from: b  reason: collision with root package name */
    private final TopRankFragment f16991b;

    k(TopRankFragment topRankFragment) {
        this.f16991b = topRankFragment;
    }

    public final int a(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f16990a, false, 13046, new Class[]{Object.class}, Integer.TYPE)) {
            return ((String) obj).equals(this.f16991b.f16958c.f17022e) ? 0 : 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f16990a, false, 13046, new Class[]{Object.class}, Integer.TYPE)).intValue();
    }
}
