package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;

public final /* synthetic */ class j implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41950a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchWordViewHolder f41951b;

    /* renamed from: c  reason: collision with root package name */
    private final HotSearchItem f41952c;

    j(HotSearchWordViewHolder hotSearchWordViewHolder, HotSearchItem hotSearchItem) {
        this.f41951b = hotSearchWordViewHolder;
        this.f41952c = hotSearchItem;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f41950a, false, 35625, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f41950a, false, 35625, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        HotSearchWordViewHolder hotSearchWordViewHolder = this.f41951b;
        d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(this.f41952c.getAdData()).a(hotSearchWordViewHolder.itemView.getContext());
    }
}
