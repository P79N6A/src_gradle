package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView;

public final /* synthetic */ class y implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43205a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchAndDiscoveryFragment2 f43206b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchWordsFlipperView.ItemUnion f43207c;

    y(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2, HotSearchWordsFlipperView.ItemUnion itemUnion) {
        this.f43206b = hotSearchAndDiscoveryFragment2;
        this.f43207c = itemUnion;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f43205a, false, 37648, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f43205a, false, 37648, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2 = this.f43206b;
        d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(this.f43207c.f42929c.getAdData()).a(hotSearchAndDiscoveryFragment2.getContext());
    }
}
