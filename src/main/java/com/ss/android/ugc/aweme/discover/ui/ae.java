package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView;

public final /* synthetic */ class ae implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43105a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchWordsFlipperView f43106b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchWordsFlipperView.ItemUnion f43107c;

    ae(HotSearchWordsFlipperView hotSearchWordsFlipperView, HotSearchWordsFlipperView.ItemUnion itemUnion) {
        this.f43106b = hotSearchWordsFlipperView;
        this.f43107c = itemUnion;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f43105a, false, 37685, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f43105a, false, 37685, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        HotSearchWordsFlipperView hotSearchWordsFlipperView = this.f43106b;
        d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(this.f43107c.f42929c.getAdData()).a(hotSearchWordsFlipperView.getContext());
    }
}
